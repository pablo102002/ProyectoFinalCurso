package Wordle;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.CaretListener;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;

public class Ventana {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private int contadorFila=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 533, 747);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_Juego = new JPanel();
		panel_Juego.setBounds(33, 98, 375, 422);
		frame.getContentPane().add(panel_Juego);
		panel_Juego.setLayout(new GridLayout(6, 5, 10, 10));
		
		JButton btn_Enviar = new JButton("Enviar");
		btn_Enviar.setBounds(165, 562, 105, 27);
		frame.getContentPane().add(btn_Enviar);
		
		JLabel Etiqueta_ErrorLetra = new JLabel("");
		Etiqueta_ErrorLetra.setFont(new Font("Dialog", Font.BOLD, 26));
		Etiqueta_ErrorLetra.setForeground(Color.RED);
		Etiqueta_ErrorLetra.setBounds(124, 601, 196, 45);
		frame.getContentPane().add(Etiqueta_ErrorLetra);
		
		JLabel Etiqueta_Ganar = new JLabel("");
		Etiqueta_Ganar.setFont(new Font("Dialog", Font.BOLD, 26));
		Etiqueta_Ganar.setForeground(Color.GREEN);
		Etiqueta_Ganar.setBounds(136, 647, 184, 55);
		frame.getContentPane().add(Etiqueta_Ganar);
		
		ArrayList<String> palabrasDiccionario = new ArrayList<String>();
		palabrasDiccionario.add("HUESO");
		palabrasDiccionario.add("TIMAR");
		palabrasDiccionario.add("MIRAR");
		palabrasDiccionario.add("HACER");
		palabrasDiccionario.add("ASPAS");
		palabrasDiccionario.add("TRAES");
		palabrasDiccionario.add("OSTRA");
		palabrasDiccionario.add("LIMON");
		palabrasDiccionario.add("RATON");
		palabrasDiccionario.add("SITIO");
		
		int numero = (int)(Math.random()*palabrasDiccionario.size()-1+1);
		final String palabraResuelta=palabrasDiccionario.get(numero);
		System.out.println(palabraResuelta);
		
		/*
		 * Creamos ArrayList para que sea mas facil manejar las paabras
		 */
		ArrayList<JTextField> fila1 = new ArrayList<JTextField>();
		ArrayList<JTextField> fila2 = new ArrayList<JTextField>();
		ArrayList<JTextField> fila3 = new ArrayList<JTextField>();
		ArrayList<JTextField> fila4 = new ArrayList<JTextField>();
		ArrayList<JTextField> fila5 = new ArrayList<JTextField>();
		ArrayList<JTextField> fila6 = new ArrayList<JTextField>();
		
		//Crear los JTexfields mediante un bucle
		JTextField[][] ArrayWordle=new JTextField[6][5];
		KeyListener KeyL=new KeyAdapter(ArrayWordle);
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<5;j++) {
				if(i==0) {
					ArrayWordle[i][j] = new JTextField();
				}
				else {
					ArrayWordle[i][j] = new JTextField();
					ArrayWordle[i][j].setEditable(false);
				}
				ArrayWordle[i][j].setName(i+" "+j);
				ArrayWordle[i][j].setHorizontalAlignment(SwingConstants.CENTER);
				ArrayWordle[i][j].setFont(new Font("Dialog", Font.BOLD, 30));
				panel_Juego.add(ArrayWordle[i][j]);
				ArrayWordle[i][j].addKeyListener(KeyL);
				
				switch(i) {
				case 0: 
					fila1.add(ArrayWordle[i][j]);
					break;
				case 1: 
					fila2.add(ArrayWordle[i][j]);
					break;
				case 2:
					fila3.add(ArrayWordle[i][j]);
					break;
				case 3: 
					fila4.add(ArrayWordle[i][j]);
					break;
				case 4: 
					fila5.add(ArrayWordle[i][j]);
					break;
				case 5: 
					fila6.add(ArrayWordle[i][j]);
					break;
				}
				
			}
		}
	
		btn_Enviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int contadorGanar=0;
				String palabraFila1="";
				String palabraFila2="";
				String palabraFila3="";
				String palabraFila4="";
				String palabraFila5="";
				String palabraFila6="";

				switch (contadorFila) 
				{
				case 0: 
					palabraFila1=Metodos.CrearPalabraFila(fila1, palabraFila1);
					System.out.println(palabraFila1);
					contadorGanar=Metodos.ComprobarPalabraCorrecta(fila1,palabraFila1,palabraResuelta,Etiqueta_ErrorLetra,contadorGanar);
					System.out.println("Cont: "+contadorGanar);
					if(contadorGanar==5) {
						Metodos.DeshabilitarJTextField(fila1);
						Metodos.PonerLetraGris(fila1);
						Metodos.HasGanado(btn_Enviar, Etiqueta_Ganar);
					}
					else if(palabraFila1.length()==5) {
						Metodos.PonerLetraGris(fila1);
						contadorGanar=0;
						contadorFila++;
						Metodos.DeshabilitarJTextField(fila1);
						Metodos.HabilitarJTextField(fila2);
						fila2.get(0).requestFocus();
					}
					;
					break;
				case 1: 
					palabraFila2=Metodos.CrearPalabraFila(fila2, palabraFila2);
					System.out.println(palabraFila2);
					contadorGanar=Metodos.ComprobarPalabraCorrecta(fila2,palabraFila2,palabraResuelta,Etiqueta_ErrorLetra,contadorGanar);
					System.out.println("Cont: "+contadorGanar);
					if(contadorGanar==5) {
						Metodos.DeshabilitarJTextField(fila2);
						Metodos.PonerLetraGris(fila2);
						Metodos.HasGanado(btn_Enviar, Etiqueta_Ganar);
					}
					else if(palabraFila2.length()==5) {
						Metodos.PonerLetraGris(fila2);
						contadorGanar=0;
						contadorFila++;
						Metodos.DeshabilitarJTextField(fila2);
						Metodos.HabilitarJTextField(fila3);
						fila3.get(0).requestFocus();
					}
					;
					break;
				case 2:  
					palabraFila3=Metodos.CrearPalabraFila(fila3, palabraFila3);
					System.out.println(palabraFila3);
					contadorGanar=Metodos.ComprobarPalabraCorrecta(fila3,palabraFila3,palabraResuelta,Etiqueta_ErrorLetra,contadorGanar);
					System.out.println("Cont: "+contadorGanar);
					if(contadorGanar==5) {
						Metodos.DeshabilitarJTextField(fila3);
						Metodos.PonerLetraGris(fila3);
						Metodos.HasGanado(btn_Enviar, Etiqueta_Ganar);
					}
					else if(palabraFila3.length()==5) {
						Metodos.PonerLetraGris(fila3);
						contadorGanar=0;
						contadorFila++;
						Metodos.DeshabilitarJTextField(fila3);
						Metodos.HabilitarJTextField(fila4);
						fila4.get(0).requestFocus();
					}
					;
					break;
				case 3:  
					palabraFila4=Metodos.CrearPalabraFila(fila4, palabraFila4);
					System.out.println(palabraFila4);
					contadorGanar=Metodos.ComprobarPalabraCorrecta(fila4,palabraFila4,palabraResuelta,Etiqueta_ErrorLetra,contadorGanar);
					System.out.println(contadorGanar);
					System.out.println("Cont: "+contadorGanar);
					if(contadorGanar==5) {
						Metodos.DeshabilitarJTextField(fila4);
						Metodos.PonerLetraGris(fila4);
						Metodos.HasGanado(btn_Enviar, Etiqueta_Ganar);
					}
					else if(palabraFila4.length()==5) {
						Metodos.PonerLetraGris(fila4);
						contadorGanar=0;
						contadorFila++;
						Metodos.DeshabilitarJTextField(fila4);
						Metodos.HabilitarJTextField(fila5);
						fila5.get(0).requestFocus();
					}
					;
					break;
				case 4:  
					palabraFila5=Metodos.CrearPalabraFila(fila5, palabraFila5);
					System.out.println(palabraFila5);
					contadorGanar=Metodos.ComprobarPalabraCorrecta(fila5,palabraFila5,palabraResuelta,Etiqueta_ErrorLetra,contadorGanar);
					System.out.println("Cont: "+contadorGanar);
					if(contadorGanar==5) {
						Metodos.DeshabilitarJTextField(fila5);
						Metodos.PonerLetraGris(fila5);
						Metodos.HasGanado(btn_Enviar, Etiqueta_Ganar);
					}
					else if(palabraFila5.length()==5) {
						Metodos.PonerLetraGris(fila5);
						contadorGanar=0;
						contadorFila++;
						Metodos.DeshabilitarJTextField(fila5);
						Metodos.HabilitarJTextField(fila6);
						fila6.get(0).requestFocus();
					}
					;
					break;
				case 5:  
					palabraFila6=Metodos.CrearPalabraFila(fila6, palabraFila6);
					System.out.println(palabraFila6);
					contadorGanar=Metodos.ComprobarPalabraCorrecta(fila6,palabraFila6,palabraResuelta,Etiqueta_ErrorLetra,contadorGanar);
					System.out.println("Cont: "+contadorGanar);
					if(contadorGanar==5) {
						Metodos.DeshabilitarJTextField(fila6	);
						Metodos.PonerLetraGris(fila6);
						Metodos.HasGanado(btn_Enviar, Etiqueta_Ganar);
					}
					else if(palabraFila6.length()==5) {
						Metodos.PonerLetraGris(fila6);
						contadorGanar=0;
						contadorFila++;
						Metodos.DeshabilitarJTextField(fila6);
					}
					;
					break;
				}
			}
		});
		
	}
}
