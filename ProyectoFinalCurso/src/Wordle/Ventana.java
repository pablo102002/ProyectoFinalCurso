package Wordle;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.CaretEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ventana {

	private JFrame frame;
	private JTextField textField_Fila1Letra1;
	private JTextField textField_Fila1Letra2;
	private JTextField textField_Fila1Letra3;
	private JTextField textField_Fila1Letra4;
	private JTextField textField_Fila1Letra5;
	private JTextField textField_Fila2Letra1;
	private JTextField textField_Fila2Letra2;
	private JTextField textField_Fila2Letra3;
	private JTextField textField_Fila2Letra4;
	private JTextField textField_Fila2Letra5;
	private JTextField textField_Fila3Letra1;
	private JTextField textField_Fila3Letra2;
	private JTextField textField_Fila3Letra3;
	private JTextField textField_Fila3Letra4;
	private JTextField textField_Fila3Letra5;
	private JTextField textField_Fila4Letra1;
	private JTextField textField_Fila4Letra2;
	private JTextField textField_Fila4Letra3;
	private JTextField textField_Fila4Letra4;
	private JTextField textField_Fila4Letra5;
	private JTextField textField_Fila5Letra1;
	private JTextField textField_Fila5Letra2;
	private JTextField textField_Fila5Letra3;
	private JTextField textField_Fila5Letra4;
	private JTextField textField_Fila5Letra5;
	private JTextField textField_Fila6Letra1;
	private JTextField textField_Fila6Letra2;
	private JTextField textField_Fila6Letra3;
	private JTextField textField_Fila6Letra4;
	private JTextField textField_Fila6Letra5;
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
		frame.setBounds(100, 100, 740, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField_Fila1Letra1 = new JTextField();
		textField_Fila1Letra1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila1Letra1.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila1Letra1.setBounds(68, 57, 61, 53);
		frame.getContentPane().add(textField_Fila1Letra1);
		textField_Fila1Letra1.setColumns(10);
		
		textField_Fila1Letra2 = new JTextField();
		textField_Fila1Letra2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila1Letra2.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila1Letra2.setColumns(10);
		textField_Fila1Letra2.setBounds(158, 57, 61, 53);
		frame.getContentPane().add(textField_Fila1Letra2);
		
		textField_Fila1Letra3 = new JTextField();
		textField_Fila1Letra3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila1Letra3.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila1Letra3.setColumns(10);
		textField_Fila1Letra3.setBounds(248, 57, 61, 53);
		frame.getContentPane().add(textField_Fila1Letra3);
		
		textField_Fila1Letra4 = new JTextField();
		textField_Fila1Letra4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila1Letra4.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila1Letra4.setColumns(10);
		textField_Fila1Letra4.setBounds(338, 57, 61, 53);
		frame.getContentPane().add(textField_Fila1Letra4);
		
		textField_Fila1Letra5 = new JTextField();
		textField_Fila1Letra5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila1Letra5.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila1Letra5.setColumns(10);
		textField_Fila1Letra5.setBounds(428, 57, 61, 53);
		frame.getContentPane().add(textField_Fila1Letra5);
		
		textField_Fila2Letra1 = new JTextField();
		textField_Fila2Letra1.setEditable(false);
		textField_Fila2Letra1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila2Letra1.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila2Letra1.setColumns(10);
		textField_Fila2Letra1.setBounds(68, 147, 61, 53);
		frame.getContentPane().add(textField_Fila2Letra1);
		
		textField_Fila2Letra2 = new JTextField();
		textField_Fila2Letra2.setEditable(false);
		textField_Fila2Letra2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila2Letra2.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila2Letra2.setColumns(10);
		textField_Fila2Letra2.setBounds(158, 147, 61, 53);
		frame.getContentPane().add(textField_Fila2Letra2);
		
		textField_Fila2Letra3 = new JTextField();
		textField_Fila2Letra3.setEditable(false);
		textField_Fila2Letra3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila2Letra3.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila2Letra3.setColumns(10);
		textField_Fila2Letra3.setBounds(248, 147, 61, 53);
		frame.getContentPane().add(textField_Fila2Letra3);
		
		textField_Fila2Letra4 = new JTextField();
		textField_Fila2Letra4.setEditable(false);
		textField_Fila2Letra4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila2Letra4.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila2Letra4.setColumns(10);
		textField_Fila2Letra4.setBounds(338, 147, 61, 53);
		frame.getContentPane().add(textField_Fila2Letra4);
		
		textField_Fila2Letra5 = new JTextField();
		textField_Fila2Letra5.setEditable(false);
		textField_Fila2Letra5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila2Letra5.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila2Letra5.setColumns(10);
		textField_Fila2Letra5.setBounds(428, 147, 61, 53);
		frame.getContentPane().add(textField_Fila2Letra5);
		
		textField_Fila3Letra1 = new JTextField();
		textField_Fila3Letra1.setEditable(false);
		textField_Fila3Letra1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila3Letra1.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila3Letra1.setColumns(10);
		textField_Fila3Letra1.setBounds(68, 237, 61, 53);
		frame.getContentPane().add(textField_Fila3Letra1);
		
		textField_Fila3Letra2 = new JTextField();
		textField_Fila3Letra2.setEditable(false);
		textField_Fila3Letra2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila3Letra2.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila3Letra2.setColumns(10);
		textField_Fila3Letra2.setBounds(158, 237, 61, 53);
		frame.getContentPane().add(textField_Fila3Letra2);
		
		textField_Fila3Letra3 = new JTextField();
		textField_Fila3Letra3.setEditable(false);
		textField_Fila3Letra3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila3Letra3.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila3Letra3.setColumns(10);
		textField_Fila3Letra3.setBounds(248, 237, 61, 53);
		frame.getContentPane().add(textField_Fila3Letra3);
		
		textField_Fila3Letra4 = new JTextField();
		textField_Fila3Letra4.setEditable(false);
		textField_Fila3Letra4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila3Letra4.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila3Letra4.setColumns(10);
		textField_Fila3Letra4.setBounds(338, 237, 61, 53);
		frame.getContentPane().add(textField_Fila3Letra4);
		
		textField_Fila3Letra5 = new JTextField();
		textField_Fila3Letra5.setEditable(false);
		textField_Fila3Letra5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila3Letra5.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila3Letra5.setColumns(10);
		textField_Fila3Letra5.setBounds(428, 237, 61, 53);
		frame.getContentPane().add(textField_Fila3Letra5);
		
		textField_Fila4Letra1 = new JTextField();
		textField_Fila4Letra1.setEditable(false);
		textField_Fila4Letra1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila4Letra1.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila4Letra1.setColumns(10);
		textField_Fila4Letra1.setBounds(68, 327, 61, 53);
		frame.getContentPane().add(textField_Fila4Letra1);
		
		textField_Fila4Letra2 = new JTextField();
		textField_Fila4Letra2.setEditable(false);
		textField_Fila4Letra2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila4Letra2.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila4Letra2.setColumns(10);
		textField_Fila4Letra2.setBounds(158, 327, 61, 53);
		frame.getContentPane().add(textField_Fila4Letra2);
		
		textField_Fila4Letra3 = new JTextField();
		textField_Fila4Letra3.setEditable(false);
		textField_Fila4Letra3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila4Letra3.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila4Letra3.setColumns(10);
		textField_Fila4Letra3.setBounds(248, 327, 61, 53);
		frame.getContentPane().add(textField_Fila4Letra3);
		
		textField_Fila4Letra4 = new JTextField();
		textField_Fila4Letra4.setEditable(false);
		textField_Fila4Letra4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila4Letra4.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila4Letra4.setColumns(10);
		textField_Fila4Letra4.setBounds(338, 327, 61, 53);
		frame.getContentPane().add(textField_Fila4Letra4);
		
		textField_Fila4Letra5 = new JTextField();
		textField_Fila4Letra5.setEditable(false);
		textField_Fila4Letra5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila4Letra5.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila4Letra5.setColumns(10);
		textField_Fila4Letra5.setBounds(428, 327, 61, 53);
		frame.getContentPane().add(textField_Fila4Letra5);
		
		textField_Fila5Letra1 = new JTextField();
		textField_Fila5Letra1.setEditable(false);
		textField_Fila5Letra1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila5Letra1.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila5Letra1.setColumns(10);
		textField_Fila5Letra1.setBounds(68, 417, 61, 53);
		frame.getContentPane().add(textField_Fila5Letra1);
		
		textField_Fila5Letra2 = new JTextField();
		textField_Fila5Letra2.setEditable(false);
		textField_Fila5Letra2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila5Letra2.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila5Letra2.setColumns(10);
		textField_Fila5Letra2.setBounds(158, 417, 61, 53);
		frame.getContentPane().add(textField_Fila5Letra2);
		
		textField_Fila5Letra3 = new JTextField();
		textField_Fila5Letra3.setEditable(false);
		textField_Fila5Letra3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila5Letra3.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila5Letra3.setColumns(10);
		textField_Fila5Letra3.setBounds(248, 417, 61, 53);
		frame.getContentPane().add(textField_Fila5Letra3);
		
		textField_Fila5Letra4 = new JTextField();
		textField_Fila5Letra4.setEditable(false);
		textField_Fila5Letra4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila5Letra4.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila5Letra4.setColumns(10);
		textField_Fila5Letra4.setBounds(338, 417, 61, 53);
		frame.getContentPane().add(textField_Fila5Letra4);
		
		textField_Fila5Letra5 = new JTextField();
		textField_Fila5Letra5.setEditable(false);
		textField_Fila5Letra5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila5Letra5.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila5Letra5.setColumns(10);
		textField_Fila5Letra5.setBounds(428, 417, 61, 53);
		frame.getContentPane().add(textField_Fila5Letra5);
		
		textField_Fila6Letra1 = new JTextField();
		textField_Fila6Letra1.setEditable(false);
		textField_Fila6Letra1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila6Letra1.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila6Letra1.setColumns(10);
		textField_Fila6Letra1.setBounds(68, 507, 61, 53);
		frame.getContentPane().add(textField_Fila6Letra1);
		
		textField_Fila6Letra2 = new JTextField();
		textField_Fila6Letra2.setEditable(false);
		textField_Fila6Letra2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila6Letra2.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila6Letra2.setColumns(10);
		textField_Fila6Letra2.setBounds(158, 507, 61, 53);
		frame.getContentPane().add(textField_Fila6Letra2);
		
		textField_Fila6Letra3 = new JTextField();
		textField_Fila6Letra3.setEditable(false);
		textField_Fila6Letra3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila6Letra3.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila6Letra3.setColumns(10);
		textField_Fila6Letra3.setBounds(248, 507, 61, 53);
		frame.getContentPane().add(textField_Fila6Letra3);
		
		textField_Fila6Letra4 = new JTextField();
		textField_Fila6Letra4.setEditable(false);
		textField_Fila6Letra4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila6Letra4.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila6Letra4.setColumns(10);
		textField_Fila6Letra4.setBounds(338, 507, 61, 53);
		frame.getContentPane().add(textField_Fila6Letra4);
		
		textField_Fila6Letra5 = new JTextField();
		textField_Fila6Letra5.setEditable(false);
		textField_Fila6Letra5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila6Letra5.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila6Letra5.setColumns(10);
		textField_Fila6Letra5.setBounds(428, 507, 61, 53);
		frame.getContentPane().add(textField_Fila6Letra5);
	
		
		JButton btn_EnviarPalabra = new JButton("Enviar");
		btn_EnviarPalabra.setBounds(222, 617, 105, 27);
		frame.getContentPane().add(btn_EnviarPalabra);
		
		JLabel Etiqueta_ErrorLetra = new JLabel("");
		Etiqueta_ErrorLetra.setFont(new Font("Dialog", Font.BOLD, 18));
		Etiqueta_ErrorLetra.setForeground(Color.RED);
		Etiqueta_ErrorLetra.setBounds(68, 656, 421, 42);
		frame.getContentPane().add(Etiqueta_ErrorLetra);
		
		JLabel Etiqueta_Ganar = new JLabel("");
		Etiqueta_Ganar.setHorizontalAlignment(SwingConstants.CENTER);
		Etiqueta_Ganar.setForeground(Color.GREEN);
		Etiqueta_Ganar.setFont(new Font("Dialog", Font.BOLD, 24));
		Etiqueta_Ganar.setBounds(68, 656, 421, 42);
		frame.getContentPane().add(Etiqueta_Ganar);
		
		
		/*
		 * Creamos una ArrayList la cual contendra muchas palabras las cuales luego se pasaran a 
		 * un String el cual sera la palabra la cual tienen que adivinar
		 */
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
	
		
		ArrayList<JTextField> fila1 = new ArrayList<JTextField>();
		fila1.add(textField_Fila1Letra1);
		fila1.add(textField_Fila1Letra2);
		fila1.add(textField_Fila1Letra3);
		fila1.add(textField_Fila1Letra4);
		fila1.add(textField_Fila1Letra5);
		
		ArrayList<JTextField> fila2 = new ArrayList<JTextField>();
		fila2.add(textField_Fila2Letra1);
		fila2.add(textField_Fila2Letra2);
		fila2.add(textField_Fila2Letra3);
		fila2.add(textField_Fila2Letra4);
		fila2.add(textField_Fila2Letra5);
		
		ArrayList<JTextField> fila3 = new ArrayList<JTextField>();
		fila3.add(textField_Fila3Letra1);
		fila3.add(textField_Fila3Letra2);
		fila3.add(textField_Fila3Letra3);
		fila3.add(textField_Fila3Letra4);
		fila3.add(textField_Fila3Letra5);
		
		ArrayList<JTextField> fila4 = new ArrayList<JTextField>();
		fila4.add(textField_Fila4Letra1);
		fila4.add(textField_Fila4Letra2);
		fila4.add(textField_Fila4Letra3);
		fila4.add(textField_Fila4Letra4);
		fila4.add(textField_Fila4Letra5);
		
		ArrayList<JTextField> fila5 = new ArrayList<JTextField>();
		fila5.add(textField_Fila5Letra1);
		fila5.add(textField_Fila5Letra2);
		fila5.add(textField_Fila5Letra3);
		fila5.add(textField_Fila5Letra4);
		fila5.add(textField_Fila5Letra5);
		
		
		ArrayList<JTextField> fila6 = new ArrayList<JTextField>();
		fila6.add(textField_Fila6Letra1);
		fila6.add(textField_Fila6Letra2);
		fila6.add(textField_Fila6Letra3);
		fila6.add(textField_Fila6Letra4);
		fila6.add(textField_Fila6Letra5);
		
		
		/*
		 * INICIO DE LOS EVENTOS DE LA FILA 1
		 */
		textField_Fila1Letra1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Metodos.PonerLetraMayuscula(textField_Fila1Letra1);
				
				int key = e.getKeyChar();
				
				boolean may = key >= 65 && key <= 90;
				boolean min = key >= 97 && key <= 122;
				
				if(key!=KeyEvent.VK_BACK_SPACE) {
					textField_Fila1Letra2.requestFocus();
				}
				else {
					textField_Fila1Letra1.requestFocus();
				}
				if (!(min || may) || (textField_Fila1Letra1.getText().length() > 0) )
 {
					e.consume();
			        
			    }
			}
		});
		textField_Fila1Letra2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Metodos.PonerLetraMayuscula(textField_Fila1Letra2);
				int key = e.getKeyChar();

				boolean may = key >= 65 && key <= 90;
				boolean min = key >= 97 && key <= 122;
				
				if(key!=KeyEvent.VK_BACK_SPACE) {
					textField_Fila1Letra3.requestFocus();
				}
				else {
					textField_Fila1Letra1.requestFocus();
				}
				
				if (!(min || may) || (textField_Fila1Letra2.getText().length() > 0) ){
			        e.consume();
			    }
			}
		});
		textField_Fila1Letra3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Metodos.PonerLetraMayuscula(textField_Fila1Letra3);
				int key = e.getKeyChar();

				boolean may = key >= 65 && key <= 90;
				boolean min = key >= 97 && key <= 122;
				
				if(key!=KeyEvent.VK_BACK_SPACE) {
					textField_Fila1Letra4.requestFocus();
				}
				else {
					textField_Fila1Letra2.requestFocus();
				}
				
				if (!(min || may) || (textField_Fila1Letra3.getText().length() > 0) ){
			        e.consume();
			    }
			}
		});
		textField_Fila1Letra4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Metodos.PonerLetraMayuscula(textField_Fila1Letra4);
				
				int key = e.getKeyChar();

				boolean may = key >= 65 && key <= 90;
				boolean min = key >= 97 && key <= 122;
				
				if(key!=KeyEvent.VK_BACK_SPACE) {
					textField_Fila1Letra5.requestFocus();
				}
				else {
					textField_Fila1Letra3.requestFocus();
				}
				
				if (!(min || may) || (textField_Fila1Letra4.getText().length() > 0) ){
			        e.consume();
			    }
			}
		});
		textField_Fila1Letra5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Metodos.PonerLetraMayuscula(textField_Fila1Letra5);
				int key = e.getKeyChar();

				boolean may = key >= 65 && key <= 90;
				boolean min = key >= 97 && key <= 122;
				
				if(key==KeyEvent.VK_BACK_SPACE) {
					textField_Fila1Letra4.requestFocus();
				}
		
				if (!(min || may) || (textField_Fila1Letra5.getText().length() > 0) ){
			        e.consume();
			    }
			}
		});
		
		/*
		 * FINAL DE LOS EVENTOS DE LA FILA 1
		 */
		
		/*
		 * INICIO DE LOS EVENTOS DE LA FILA 2
		 */
		
		textField_Fila2Letra1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Metodos.PonerLetraMayuscula(textField_Fila2Letra1);
				
				int key = e.getKeyChar();
				
				boolean may = key >= 65 && key <= 90;
				boolean min = key >= 97 && key <= 122;
				
				if(key!=KeyEvent.VK_BACK_SPACE) {
					textField_Fila2Letra2.requestFocus();
				}
				else {
					textField_Fila2Letra1.requestFocus();
				}
				if (!(min || may) || (textField_Fila2Letra1.getText().length() > 0) )
 {
					e.consume();
			        
			    }
			}
		});
		textField_Fila2Letra2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Metodos.PonerLetraMayuscula(textField_Fila2Letra2);
				int key = e.getKeyChar();

				boolean may = key >= 65 && key <= 90;
				boolean min = key >= 97 && key <= 122;
				
				if(key!=KeyEvent.VK_BACK_SPACE) {
					textField_Fila2Letra3.requestFocus();
				}
				else {
					textField_Fila2Letra1.requestFocus();
				}
				
				if (!(min || may) || (textField_Fila2Letra2.getText().length() > 0) ){
			        e.consume();
			    }
			}
		});
		textField_Fila2Letra3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Metodos.PonerLetraMayuscula(textField_Fila2Letra3);
				int key = e.getKeyChar();

				boolean may = key >= 65 && key <= 90;
				boolean min = key >= 97 && key <= 122;
				
				if(key!=KeyEvent.VK_BACK_SPACE) {
					textField_Fila2Letra4.requestFocus();
				}
				else {
					textField_Fila2Letra2.requestFocus();
				}
				
				if (!(min || may) || (textField_Fila2Letra3.getText().length() > 0) ){
			        e.consume();
			    }
			}
		});
		textField_Fila2Letra4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Metodos.PonerLetraMayuscula(textField_Fila2Letra4);
				
				int key = e.getKeyChar();

				boolean may = key >= 65 && key <= 90;
				boolean min = key >= 97 && key <= 122;
				
				if(key!=KeyEvent.VK_BACK_SPACE) {
					textField_Fila2Letra5.requestFocus();
				}
				else {
					textField_Fila2Letra3.requestFocus();
				}
				
				if (!(min || may) || (textField_Fila2Letra4.getText().length() > 0) ){
			        e.consume();
			    }
			}
		});
		textField_Fila2Letra5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Metodos.PonerLetraMayuscula(textField_Fila2Letra5);
				int key = e.getKeyChar();

				boolean may = key >= 65 && key <= 90;
				boolean min = key >= 97 && key <= 122;
				
				if(key==KeyEvent.VK_BACK_SPACE) {
					textField_Fila2Letra4.requestFocus();
				}
		
				if (!(min || may) || (textField_Fila2Letra5.getText().length() > 0) ){
			        e.consume();
			    }
			}
		});
		
		/*
		 * FINAL DE LOS EVENTOS DE LA FILA 2
		 */
		
		/*
		 * INICIO DE LOS EVENTOS DE LA FILA 3
		 */
		
		textField_Fila3Letra1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Metodos.PonerLetraMayuscula(textField_Fila3Letra1);
				
				int key = e.getKeyChar();
				
				boolean may = key >= 65 && key <= 90;
				boolean min = key >= 97 && key <= 122;
				
				if(key!=KeyEvent.VK_BACK_SPACE) {
					textField_Fila3Letra2.requestFocus();
				}
				else {
					textField_Fila3Letra1.requestFocus();
				}
				if (!(min || may) || (textField_Fila3Letra1.getText().length() > 0) )
 {
					e.consume();
			        
			    }
			}
		});
		textField_Fila3Letra2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Metodos.PonerLetraMayuscula(textField_Fila3Letra2);
				int key = e.getKeyChar();

				boolean may = key >= 65 && key <= 90;
				boolean min = key >= 97 && key <= 122;
				
				if(key!=KeyEvent.VK_BACK_SPACE) {
					textField_Fila3Letra3.requestFocus();
				}
				else {
					textField_Fila3Letra1.requestFocus();
				}
				
				if (!(min || may) || (textField_Fila3Letra2.getText().length() > 0) ){
			        e.consume();
			    }
			}
		});
		textField_Fila3Letra3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Metodos.PonerLetraMayuscula(textField_Fila3Letra3);
				int key = e.getKeyChar();

				boolean may = key >= 65 && key <= 90;
				boolean min = key >= 97 && key <= 122;
				
				if(key!=KeyEvent.VK_BACK_SPACE) {
					textField_Fila3Letra4.requestFocus();
				}
				else {
					textField_Fila3Letra2.requestFocus();
				}
				
				if (!(min || may) || (textField_Fila3Letra3.getText().length() > 0) ){
			        e.consume();
			    }
			}
		});
		textField_Fila3Letra4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Metodos.PonerLetraMayuscula(textField_Fila3Letra4);
				
				int key = e.getKeyChar();

				boolean may = key >= 65 && key <= 90;
				boolean min = key >= 97 && key <= 122;
				
				if(key!=KeyEvent.VK_BACK_SPACE) {
					textField_Fila3Letra5.requestFocus();
				}
				else {
					textField_Fila3Letra3.requestFocus();
				}
				
				if (!(min || may) || (textField_Fila3Letra4.getText().length() > 0) ){
			        e.consume();
			    }
			}
		});
		textField_Fila3Letra5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Metodos.PonerLetraMayuscula(textField_Fila3Letra5);
				int key = e.getKeyChar();

				boolean may = key >= 65 && key <= 90;
				boolean min = key >= 97 && key <= 122;
				
				if(key==KeyEvent.VK_BACK_SPACE) {
					textField_Fila3Letra4.requestFocus();
				}
		
				if (!(min || may) || (textField_Fila3Letra5.getText().length() > 0) ){
			        e.consume();
			    }
			}
		});
		
		/*
		 * FINAL DE LOS EVENTOS DE LA FILA 3
		 */
		
		/*
		 * INICIO DE LOS EVENTOS DE LA FILA 4
		 */
		
		textField_Fila4Letra1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Metodos.PonerLetraMayuscula(textField_Fila4Letra1);
				
				int key = e.getKeyChar();
				
				boolean may = key >= 65 && key <= 90;
				boolean min = key >= 97 && key <= 122;
				
				if(key!=KeyEvent.VK_BACK_SPACE) {
					textField_Fila4Letra2.requestFocus();
				}
				else {
					textField_Fila4Letra1.requestFocus();
				}
				if (!(min || may) || (textField_Fila4Letra1.getText().length() > 0) )
 {
					e.consume();
			        
			    }
			}
		});
		textField_Fila4Letra2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Metodos.PonerLetraMayuscula(textField_Fila4Letra2);
				int key = e.getKeyChar();

				boolean may = key >= 65 && key <= 90;
				boolean min = key >= 97 && key <= 122;
				
				if(key!=KeyEvent.VK_BACK_SPACE) {
					textField_Fila4Letra3.requestFocus();
				}
				else {
					textField_Fila4Letra1.requestFocus();
				}
				
				if (!(min || may) || (textField_Fila4Letra2.getText().length() > 0) ){
			        e.consume();
			    }
			}
		});
		textField_Fila4Letra3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Metodos.PonerLetraMayuscula(textField_Fila4Letra3);
				int key = e.getKeyChar();

				boolean may = key >= 65 && key <= 90;
				boolean min = key >= 97 && key <= 122;
				
				if(key!=KeyEvent.VK_BACK_SPACE) {
					textField_Fila4Letra4.requestFocus();
				}
				else {
					textField_Fila4Letra2.requestFocus();
				}
				
				if (!(min || may) || (textField_Fila4Letra3.getText().length() > 0) ){
			        e.consume();
			    }
			}
		});
		textField_Fila4Letra4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Metodos.PonerLetraMayuscula(textField_Fila4Letra4);
				
				int key = e.getKeyChar();

				boolean may = key >= 65 && key <= 90;
				boolean min = key >= 97 && key <= 122;
				
				if(key!=KeyEvent.VK_BACK_SPACE) {
					textField_Fila4Letra5.requestFocus();
				}
				else {
					textField_Fila4Letra3.requestFocus();
				}
				
				if (!(min || may) || (textField_Fila4Letra4.getText().length() > 0) ){
			        e.consume();
			    }
			}
		});
		textField_Fila4Letra5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Metodos.PonerLetraMayuscula(textField_Fila4Letra5);
				int key = e.getKeyChar();

				boolean may = key >= 65 && key <= 90;
				boolean min = key >= 97 && key <= 122;
				
				if(key==KeyEvent.VK_BACK_SPACE) {
					textField_Fila4Letra4.requestFocus();
				}
		
				if (!(min || may) || (textField_Fila4Letra5.getText().length() > 0) ){
			        e.consume();
			    }
			}
		});
		
		/*
		 * FINAL DE LOS EVENTOS DE LA FILA 4
		 */
		
		/*
		 * INICIO DE LOS EVENTOS DE LA FILA 5
		 */
		
		textField_Fila5Letra1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Metodos.PonerLetraMayuscula(textField_Fila5Letra1);
				
				int key = e.getKeyChar();
				
				boolean may = key >= 65 && key <= 90;
				boolean min = key >= 97 && key <= 122;
				
				if(key!=KeyEvent.VK_BACK_SPACE) {
					textField_Fila5Letra2.requestFocus();
				}
				else {
					textField_Fila5Letra1.requestFocus();
				}
				if (!(min || may) || (textField_Fila5Letra1.getText().length() > 0) )
 {
					e.consume();
			        
			    }
			}
		});
		textField_Fila5Letra2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Metodos.PonerLetraMayuscula(textField_Fila5Letra2);
				int key = e.getKeyChar();

				boolean may = key >= 65 && key <= 90;
				boolean min = key >= 97 && key <= 122;
				
				if(key!=KeyEvent.VK_BACK_SPACE) {
					textField_Fila5Letra3.requestFocus();
				}
				else {
					textField_Fila5Letra1.requestFocus();
				}
				
				if (!(min || may) || (textField_Fila5Letra2.getText().length() > 0) ){
			        e.consume();
			    }
			}
		});
		textField_Fila5Letra3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Metodos.PonerLetraMayuscula(textField_Fila5Letra3);
				int key = e.getKeyChar();

				boolean may = key >= 65 && key <= 90;
				boolean min = key >= 97 && key <= 122;
				
				if(key!=KeyEvent.VK_BACK_SPACE) {
					textField_Fila5Letra4.requestFocus();
				}
				else {
					textField_Fila5Letra2.requestFocus();
				}
				
				if (!(min || may) || (textField_Fila5Letra3.getText().length() > 0) ){
			        e.consume();
			    }
			}
		});
		textField_Fila5Letra4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Metodos.PonerLetraMayuscula(textField_Fila5Letra4);
				
				int key = e.getKeyChar();

				boolean may = key >= 65 && key <= 90;
				boolean min = key >= 97 && key <= 122;
				
				if(key!=KeyEvent.VK_BACK_SPACE) {
					textField_Fila5Letra5.requestFocus();
				}
				else {
					textField_Fila5Letra3.requestFocus();
				}
				
				if (!(min || may) || (textField_Fila5Letra4.getText().length() > 0) ){
			        e.consume();
			    }
			}
		});
		textField_Fila5Letra5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Metodos.PonerLetraMayuscula(textField_Fila5Letra5);
				int key = e.getKeyChar();

				boolean may = key >= 65 && key <= 90;
				boolean min = key >= 97 && key <= 122;
				
				if(key==KeyEvent.VK_BACK_SPACE) {
					textField_Fila5Letra4.requestFocus();
				}
		
				if (!(min || may) || (textField_Fila5Letra5.getText().length() > 0) ){
			        e.consume();
			    }
			}
		});
		
		/*
		 * FINAL DE LOS EVENTOS DE LA FILA 5
		 */
		
		/*
		 * INICIO DE LOS EVENTOS DE LA FILA 6
		 */
		
		textField_Fila6Letra1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Metodos.PonerLetraMayuscula(textField_Fila6Letra1);
				
				int key = e.getKeyChar();
				
				boolean may = key >= 65 && key <= 90;
				boolean min = key >= 97 && key <= 122;
				
				if(key!=KeyEvent.VK_BACK_SPACE) {
					textField_Fila6Letra2.requestFocus();
				}
				else {
					textField_Fila6Letra1.requestFocus();
				}
				if (!(min || may) || (textField_Fila6Letra1.getText().length() > 0) )
 {
					e.consume();
			        
			    }
			}
		});
		textField_Fila6Letra2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Metodos.PonerLetraMayuscula(textField_Fila6Letra2);
				int key = e.getKeyChar();

				boolean may = key >= 65 && key <= 90;
				boolean min = key >= 97 && key <= 122;
				
				if(key!=KeyEvent.VK_BACK_SPACE) {
					textField_Fila6Letra3.requestFocus();
				}
				else {
					textField_Fila6Letra1.requestFocus();
				}
				
				if (!(min || may) || (textField_Fila6Letra2.getText().length() > 0) ){
			        e.consume();
			    }
			}
		});
		textField_Fila6Letra3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Metodos.PonerLetraMayuscula(textField_Fila6Letra3);
				int key = e.getKeyChar();

				boolean may = key >= 65 && key <= 90;
				boolean min = key >= 97 && key <= 122;
				
				if(key!=KeyEvent.VK_BACK_SPACE) {
					textField_Fila6Letra4.requestFocus();
				}
				else {
					textField_Fila6Letra2.requestFocus();
				}
				
				if (!(min || may) || (textField_Fila6Letra3.getText().length() > 0) ){
			        e.consume();
			    }
			}
		});
		textField_Fila6Letra4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Metodos.PonerLetraMayuscula(textField_Fila6Letra4);
				
				int key = e.getKeyChar();

				boolean may = key >= 65 && key <= 90;
				boolean min = key >= 97 && key <= 122;
				
				if(key!=KeyEvent.VK_BACK_SPACE) {
					textField_Fila6Letra5.requestFocus();
				}
				else {
					textField_Fila6Letra3.requestFocus();
				}
				
				if (!(min || may) || (textField_Fila6Letra4.getText().length() > 0) ){
			        e.consume();
			    }
			}
		});
		textField_Fila6Letra5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Metodos.PonerLetraMayuscula(textField_Fila6Letra5);
				int key = e.getKeyChar();

				boolean may = key >= 65 && key <= 90;
				boolean min = key >= 97 && key <= 122;
				
				if(key==KeyEvent.VK_BACK_SPACE) {
					textField_Fila6Letra4.requestFocus();
				}
		
				if (!(min || may) || (textField_Fila6Letra5.getText().length() > 0) ){
			        e.consume();
			    }
			}
		});
		
		/*
		 * FINAL DE LOS EVENTOS DE LA FILA 6
		 */
		btn_EnviarPalabra.addActionListener(new ActionListener() {
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
					Metodos.PonerLetraGris(fila1);
					System.out.println("Cont: "+contadorGanar);
					if(contadorGanar==5) {
						Etiqueta_Ganar.setText("¡Has Ganado!");
						btn_EnviarPalabra.setEnabled(false);
					}
					else if(palabraFila1.length()==5) {
						contadorGanar=0;
						contadorFila++;
						Metodos.DeshabilitarJTextField(fila1);
						Metodos.HabilitarJTextField(fila2);
						textField_Fila2Letra1.requestFocus();
					}
					;
					break;
				case 1: 
					palabraFila2=Metodos.CrearPalabraFila(fila2, palabraFila2);
					System.out.println(palabraFila2);
					contadorGanar=Metodos.ComprobarPalabraCorrecta(fila2,palabraFila2,palabraResuelta,Etiqueta_ErrorLetra,contadorGanar);
					Metodos.PonerLetraGris(fila2);
					System.out.println("Cont: "+contadorGanar);
					if(contadorGanar==5) {
						Etiqueta_Ganar.setText("¡Has Ganado!");
						btn_EnviarPalabra.setEnabled(false);
					}
					else if(palabraFila2.length()==5) {
						contadorGanar=0;
						contadorFila++;
						Metodos.DeshabilitarJTextField(fila2);
						Metodos.HabilitarJTextField(fila3);
						textField_Fila3Letra1.requestFocus();
					}
					;
					break;
				case 2:  
					palabraFila3=Metodos.CrearPalabraFila(fila3, palabraFila3);
					System.out.println(palabraFila3);
					contadorGanar=Metodos.ComprobarPalabraCorrecta(fila3,palabraFila3,palabraResuelta,Etiqueta_ErrorLetra,contadorGanar);
					Metodos.PonerLetraGris(fila3);
					System.out.println("Cont: "+contadorGanar);
					if(contadorGanar==5) {
						Etiqueta_Ganar.setText("¡Has Ganado!");
						btn_EnviarPalabra.setEnabled(false);
					}
					else if(palabraFila3.length()==5) {
						contadorGanar=0;
						contadorFila++;
						Metodos.DeshabilitarJTextField(fila3);
						Metodos.HabilitarJTextField(fila4);
						textField_Fila4Letra1.requestFocus();
					}
					;
					break;
				case 3:  
					palabraFila4=Metodos.CrearPalabraFila(fila4, palabraFila4);
					System.out.println(palabraFila4);
					contadorGanar=Metodos.ComprobarPalabraCorrecta(fila4,palabraFila4,palabraResuelta,Etiqueta_ErrorLetra,contadorGanar);
					Metodos.PonerLetraGris(fila4);
					System.out.println(contadorGanar);
					System.out.println("Cont: "+contadorGanar);
					if(contadorGanar==5) {
						Etiqueta_Ganar.setText("¡Has Ganado!");
						btn_EnviarPalabra.setEnabled(false);
					}
					else if(palabraFila4.length()==5) {
						contadorGanar=0;
						contadorFila++;
						Metodos.DeshabilitarJTextField(fila4);
						Metodos.HabilitarJTextField(fila5);
						textField_Fila5Letra1.requestFocus();
					}
					;
					break;
				case 4:  
					palabraFila5=Metodos.CrearPalabraFila(fila5, palabraFila5);
					System.out.println(palabraFila5);
					contadorGanar=Metodos.ComprobarPalabraCorrecta(fila5,palabraFila5,palabraResuelta,Etiqueta_ErrorLetra,contadorGanar);
					Metodos.PonerLetraGris(fila5);
					System.out.println("Cont: "+contadorGanar);
					if(contadorGanar==5) {
						Etiqueta_Ganar.setText("¡Has Ganado!");
						btn_EnviarPalabra.setEnabled(false);
					}
					else if(palabraFila5.length()==5) {
						contadorGanar=0;
						contadorFila++;
						Metodos.DeshabilitarJTextField(fila5);
						Metodos.HabilitarJTextField(fila6);
						textField_Fila6Letra1.requestFocus();
					}
					;
					break;
				case 5:  
					palabraFila6=Metodos.CrearPalabraFila(fila6, palabraFila6);
					System.out.println(palabraFila6);
					contadorGanar=Metodos.ComprobarPalabraCorrecta(fila6,palabraFila6,palabraResuelta,Etiqueta_ErrorLetra,contadorGanar);
					Metodos.PonerLetraGris(fila6);
					System.out.println("Cont: "+contadorGanar);
					if(contadorGanar==5) {
						Etiqueta_Ganar.setText("¡Has Ganado!");
						btn_EnviarPalabra.setEnabled(false);
					}
					else if(palabraFila6.length()==5) {
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
