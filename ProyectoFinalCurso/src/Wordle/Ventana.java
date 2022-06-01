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
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;

public class Ventana {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	protected int contadorFila=0;
	protected int ContadorVictoria=0;
	protected int ContadorJuegoFinalizado=0;

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
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 650, 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_Juego = new JPanel();
		panel_Juego.setBackground(new Color(255, 255, 255));
		panel_Juego.setBounds(123, 98, 375, 422);
		frame.getContentPane().add(panel_Juego);
		panel_Juego.setLayout(new GridLayout(6, 5, 10, 10));
		
		JButton btn_Enviar = new JButton("Send");
		btn_Enviar.setBounds(255, 562, 105, 27);
		frame.getContentPane().add(btn_Enviar);
		
		JLabel Etiqueta_ErrorLetra = new JLabel("");
		Etiqueta_ErrorLetra.setFont(new Font("Dialog", Font.BOLD, 20));
		Etiqueta_ErrorLetra.setForeground(Color.RED);
		Etiqueta_ErrorLetra.setBounds(45, 601, 408, 45);
		frame.getContentPane().add(Etiqueta_ErrorLetra);
		
		JLabel Etiqueta_Ganar = new JLabel("");
		Etiqueta_Ganar.setFont(new Font("Dialog", Font.BOLD, 26));
		Etiqueta_Ganar.setForeground(Color.GREEN);
		Etiqueta_Ganar.setBounds(136, 647, 184, 55);
		frame.getContentPane().add(Etiqueta_Ganar);
		
		JButton btn_Reset = new JButton("Reset");
		btn_Reset.setBounds(476, 562, 105, 27);
		frame.getContentPane().add(btn_Reset);
		
		JLabel letraOculta = new JLabel("");
		letraOculta.setBounds(24, 135, 60, 17);
		frame.getContentPane().add(letraOculta);
		
		/*
		 * ArrayList la cual contiene las posibles palabras a adivinar
		 */
		ArrayList<String> AdivinarPalabra = new ArrayList<String>();
		AdivinarPalabra.add("HUESO");
		AdivinarPalabra.add("TIMAR");
		AdivinarPalabra.add("MIRAR");
		AdivinarPalabra.add("HACER");
		AdivinarPalabra.add("ASPAS");
		AdivinarPalabra.add("TRAES");
		AdivinarPalabra.add("OSTRA");
		AdivinarPalabra.add("LIMON");
		AdivinarPalabra.add("RATON");
		AdivinarPalabra.add("SITIO");
		AdivinarPalabra.add("JUGAR");
		AdivinarPalabra.add("JABON");
		AdivinarPalabra.add("CHICA");
		AdivinarPalabra.add("SALTA");
		AdivinarPalabra.add("VAPOR");
		AdivinarPalabra.add("PESTO");
		AdivinarPalabra.add("NINJA");
		AdivinarPalabra.add("NOCHE");
		AdivinarPalabra.add("MIXTO");
		AdivinarPalabra.add("LLENO");
		
		/*
		 * Aqui sacamos la palabra secreta mediante un numero random
		 */
		ArrayList<String> PalabraSecreta = new ArrayList<String>();
		int numero = (int)(Math.random()*AdivinarPalabra.size()-1+1);
		PalabraSecreta.add(AdivinarPalabra.get(numero));
		AdivinarPalabra.remove(numero);
		numero = (int)(Math.random()*AdivinarPalabra.size()-1+1);
		PalabraSecreta.add(AdivinarPalabra.get(numero));
		AdivinarPalabra.remove(numero);
		numero = (int)(Math.random()*AdivinarPalabra.size()-1+1);
		PalabraSecreta.add(AdivinarPalabra.get(numero));
		numero = (int)(Math.random()*AdivinarPalabra.size()-1+1);
		PalabraSecreta.add(AdivinarPalabra.get(numero));
		numero = (int)(Math.random()*AdivinarPalabra.size()-1+1);
		PalabraSecreta.add(AdivinarPalabra.get(numero));
		System.out.println(PalabraSecreta.get(0));
		System.out.println(PalabraSecreta.get(1));
		System.out.println(PalabraSecreta.get(2));
		System.out.println(PalabraSecreta.get(3));
		System.out.println(PalabraSecreta.get(4));
		
		
		/*
		 * Este ArrayList permite conprobar si una palabra es coherente
		 */

		ArrayList<String> diccionario = new ArrayList<>();
		try (BufferedReader reader = new BufferedReader(new FileReader("./files/5letras.txt"))) {

			while (reader.ready()) {
				diccionario.add(reader.readLine());
			}
		}
		//Controlando excepciones
		catch (IOException e){
			System.out.println(e.getMessage());
		}

		/*
		 * Creamos ArrayList para que sea mas facil manejar las paabras
		 */
		ArrayList<JTextField> Array2d = new ArrayList<JTextField>();
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
				ArrayWordle[i][j].setBackground(Color.WHITE);
				ArrayWordle[i][j].setName(i+" "+j);
				ArrayWordle[i][j].setHorizontalAlignment(SwingConstants.CENTER);
				ArrayWordle[i][j].setFont(new Font("Dialog", Font.BOLD, 30));
				panel_Juego.add(ArrayWordle[i][j]);
				ArrayWordle[i][j].addKeyListener(KeyL);
				Array2d.add(ArrayWordle[i][j]);

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

				switch (contadorFila) {
				case 0: 
					palabraFila1=Metodos.CrearPalabraFila(fila1, palabraFila1);
					if(diccionario.contains(palabraFila1)) {
						contadorGanar=Metodos.ComprobarPalabraCorrecta(fila1,palabraFila1,PalabraSecreta.get(ContadorJuegoFinalizado),Etiqueta_ErrorLetra,contadorGanar);
						if(contadorGanar==5) {
							ContadorJuegoFinalizado++;
							ContadorVictoria++;
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
					}
					else {
						Etiqueta_ErrorLetra.setText("La palabra no existe");
					}
					;
					break;
				case 1: 
					palabraFila2=Metodos.CrearPalabraFila(fila2, palabraFila2);
					if(diccionario.contains(palabraFila2)) {
						contadorGanar=Metodos.ComprobarPalabraCorrecta(fila2,palabraFila2,PalabraSecreta.get(ContadorJuegoFinalizado),Etiqueta_ErrorLetra,contadorGanar);
						if(contadorGanar==5) {
							ContadorJuegoFinalizado++;
							ContadorVictoria++;
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
					}
					else {
						Etiqueta_ErrorLetra.setText("La palabra no existe");
					};
					break;
				case 2:  
					palabraFila3=Metodos.CrearPalabraFila(fila3, palabraFila3);
					if(diccionario.contains(palabraFila3)) {
						contadorGanar=Metodos.ComprobarPalabraCorrecta(fila3,palabraFila3,PalabraSecreta.get(ContadorJuegoFinalizado),Etiqueta_ErrorLetra,contadorGanar);
						if(contadorGanar==5) {
							ContadorJuegoFinalizado++;
							ContadorVictoria++;
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
					}
					else {
						Etiqueta_ErrorLetra.setText("La palabra no existe");
					}
					;
					break;
				case 3:
					palabraFila4=Metodos.CrearPalabraFila(fila4, palabraFila4);
					if(diccionario.contains(palabraFila4)) {
						contadorGanar=Metodos.ComprobarPalabraCorrecta(fila4,palabraFila4,PalabraSecreta.get(ContadorJuegoFinalizado),Etiqueta_ErrorLetra,contadorGanar);

						if(contadorGanar==5) {
							ContadorJuegoFinalizado++;
							ContadorVictoria++;
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
					}
					else {
						Etiqueta_ErrorLetra.setText("La palabra no existe");
					};
					break;
				case 4: 
					palabraFila5=Metodos.CrearPalabraFila(fila5, palabraFila5);
					if(diccionario.contains(palabraFila5)) {
						contadorGanar=Metodos.ComprobarPalabraCorrecta(fila5,palabraFila5,PalabraSecreta.get(ContadorJuegoFinalizado),Etiqueta_ErrorLetra,contadorGanar);
						if(contadorGanar==5) {
							ContadorJuegoFinalizado++;
							ContadorVictoria++;
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
					}
					else {
						Etiqueta_ErrorLetra.setText("La palabra no existe");
					}
					;
					break;
				case 5: 
					palabraFila6=Metodos.CrearPalabraFila(fila6, palabraFila6);
					if(diccionario.contains(palabraFila6)) {
						contadorGanar=Metodos.ComprobarPalabraCorrecta(fila6,palabraFila6,PalabraSecreta.get(ContadorJuegoFinalizado),Etiqueta_ErrorLetra,contadorGanar);
						if(contadorGanar==5) {
							ContadorJuegoFinalizado++;
							ContadorVictoria++;
							Metodos.DeshabilitarJTextField(fila6);
							Metodos.PonerLetraGris(fila6);
							Metodos.HasGanado(btn_Enviar, Etiqueta_Ganar);
						}
						else if(palabraFila6.length()==5) {
							Metodos.PonerLetraGris(fila6);
							contadorGanar=0;
							contadorFila++;
							Metodos.DeshabilitarJTextField(fila6);
							Metodos.HasPerdido(btn_Enviar, Etiqueta_Ganar);
						}
					}
					else {
						Etiqueta_ErrorLetra.setText("La palabra no existe");
					}
					;
					break;
				}
			}
		});
		
		/*
		 * LISTENER PARA LA EL ENTER FILA1
		 */
		
		fila1.get(4).addKeyListener(new KeyAdapter(ArrayWordle) {
			@Override
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyChar();
				if(key==KeyEvent.VK_ENTER) {
					int contadorGanar=0;
					String palabraFila1="";

					palabraFila1=Metodos.CrearPalabraFila(fila1, palabraFila1);
					if(diccionario.contains(palabraFila1)) {
						System.out.println(palabraFila1);
						contadorGanar=Metodos.ComprobarPalabraCorrecta(fila1,palabraFila1,PalabraSecreta.get(ContadorJuegoFinalizado),Etiqueta_ErrorLetra,contadorGanar);
						System.out.println("Cont: "+contadorGanar);
						if(contadorGanar==5) {
							ContadorJuegoFinalizado++;
							ContadorVictoria++;
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
					}
					else {
						Etiqueta_ErrorLetra.setText("La palabra no existe");
					}	
				}
			}
		});
		
		/*
		 * LISTENER PARA LA EL ENTER FILA2
		 */
		
		fila2.get(4).addKeyListener(new KeyAdapter(ArrayWordle) {
			@Override
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyChar();
				if(key==KeyEvent.VK_ENTER) {
					int contadorGanar=0;
					String palabraFila2="";
					palabraFila2=Metodos.CrearPalabraFila(fila2, palabraFila2);
					if(diccionario.contains(palabraFila2)) {
						contadorGanar=Metodos.ComprobarPalabraCorrecta(fila2,palabraFila2,PalabraSecreta.get(ContadorJuegoFinalizado),Etiqueta_ErrorLetra,contadorGanar);
						if(contadorGanar==5) {
							ContadorJuegoFinalizado++;
							ContadorVictoria++;
							Metodos.DeshabilitarJTextField(fila1);
							Metodos.PonerLetraGris(fila1);
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



					}
				}
			}
		});

		/*
		 * LISTENER PARA LA EL ENTER FILA3
		 */

		fila3.get(4).addKeyListener(new KeyAdapter(ArrayWordle) {
			@Override
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyChar();
				if(key==KeyEvent.VK_ENTER) {
					int contadorGanar=0;
					String palabraFila3="";
					palabraFila3=Metodos.CrearPalabraFila(fila3, palabraFila3);
					if(diccionario.contains(palabraFila3)) {
						contadorGanar=Metodos.ComprobarPalabraCorrecta(fila3,palabraFila3,PalabraSecreta.get(ContadorJuegoFinalizado),Etiqueta_ErrorLetra,contadorGanar);
						if(contadorGanar==5) {
							ContadorJuegoFinalizado++;
							ContadorVictoria++;
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
					}

					else {
						Etiqueta_ErrorLetra.setText("La palabra no existe");
					}	
				}
			}
		});
		
		/*
		 * LISTENER PARA LA EL ENTER FILA4
		 */
		
		fila4.get(4).addKeyListener(new KeyAdapter(ArrayWordle) {
			@Override
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyChar();
				if(key==KeyEvent.VK_ENTER) {
					int contadorGanar=0;
					String palabraFila4="";
					palabraFila4=Metodos.CrearPalabraFila(fila4, palabraFila4);
					if(diccionario.contains(palabraFila4)) {
						contadorGanar=Metodos.ComprobarPalabraCorrecta(fila4,palabraFila4,PalabraSecreta.get(ContadorJuegoFinalizado),Etiqueta_ErrorLetra,contadorGanar);
						if(contadorGanar==5) {
							ContadorJuegoFinalizado++;
							ContadorVictoria++;
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


					}
					else {
						Etiqueta_ErrorLetra.setText("La palabra no existe");
					}	
				}
			}
		});
		
		/*
		 * LISTENER PARA LA EL ENTER FILA5
		 */
		
		fila5.get(4).addKeyListener(new KeyAdapter(ArrayWordle) {
			@Override
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyChar();
				if(key==KeyEvent.VK_ENTER) {
					int contadorGanar=0;
					String palabraFila5="";
					palabraFila5=Metodos.CrearPalabraFila(fila5, palabraFila5);
					if(diccionario.contains(palabraFila5)) {
						contadorGanar=Metodos.ComprobarPalabraCorrecta(fila5,palabraFila5,PalabraSecreta.get(ContadorJuegoFinalizado),Etiqueta_ErrorLetra,contadorGanar);
						if(contadorGanar==5) {
							ContadorJuegoFinalizado++;
							ContadorVictoria++;
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


					}
					else {
						Etiqueta_ErrorLetra.setText("La palabra no existe");
					}	
				}
			}
		});

		/*
		 * LISTENER PARA LA EL ENTER FILA6
		 */
		
		fila6.get(4).addKeyListener(new KeyAdapter(ArrayWordle) {
			@Override
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyChar();
				if(key==KeyEvent.VK_ENTER) {
					int contadorGanar=0;
					String palabraFila6="";
					palabraFila6=Metodos.CrearPalabraFila(fila6, palabraFila6);
					if(diccionario.contains(palabraFila6)) {
						contadorGanar=Metodos.ComprobarPalabraCorrecta(fila6,palabraFila6,PalabraSecreta.get(ContadorJuegoFinalizado),Etiqueta_ErrorLetra,contadorGanar);
						if(contadorGanar==5) {
							ContadorJuegoFinalizado++;
							ContadorVictoria++;
							Metodos.DeshabilitarJTextField(fila6);
							Metodos.PonerLetraGris(fila6);
							Metodos.HasGanado(btn_Enviar, Etiqueta_Ganar);
						}
						else if(palabraFila6.length()==5) {
							Metodos.PonerLetraGris(fila6);
							contadorGanar=0;
							contadorFila++;
							Metodos.DeshabilitarJTextField(fila6);
							Metodos.HasPerdido(btn_Enviar, Etiqueta_Ganar);
						}


					}
					else {
						Etiqueta_ErrorLetra.setText("La palabra no existe");
					}	
				}
			}
		});
		
		/*
		 * Esta funcion sirve para resetear el juego y volver a jugar
		 */
		
		
		btn_Reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(ContadorVictoria);
				Metodos.ResetGame(Array2d, btn_Enviar, Etiqueta_Ganar);
			}
		});
		
	}
}

