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
		textField_Fila2Letra1.setEnabled(false);
		textField_Fila2Letra1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila2Letra1.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila2Letra1.setColumns(10);
		textField_Fila2Letra1.setBounds(68, 147, 61, 53);
		frame.getContentPane().add(textField_Fila2Letra1);
		
		textField_Fila2Letra2 = new JTextField();
		textField_Fila2Letra2.setEnabled(false);
		textField_Fila2Letra2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila2Letra2.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila2Letra2.setColumns(10);
		textField_Fila2Letra2.setBounds(158, 147, 61, 53);
		frame.getContentPane().add(textField_Fila2Letra2);
		
		textField_Fila2Letra3 = new JTextField();
		textField_Fila2Letra3.setEnabled(false);
		textField_Fila2Letra3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila2Letra3.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila2Letra3.setColumns(10);
		textField_Fila2Letra3.setBounds(248, 147, 61, 53);
		frame.getContentPane().add(textField_Fila2Letra3);
		
		textField_Fila2Letra4 = new JTextField();
		textField_Fila2Letra4.setEnabled(false);
		textField_Fila2Letra4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila2Letra4.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila2Letra4.setColumns(10);
		textField_Fila2Letra4.setBounds(338, 147, 61, 53);
		frame.getContentPane().add(textField_Fila2Letra4);
		
		textField_Fila2Letra5 = new JTextField();
		textField_Fila2Letra5.setEnabled(false);
		textField_Fila2Letra5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila2Letra5.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila2Letra5.setColumns(10);
		textField_Fila2Letra5.setBounds(428, 147, 61, 53);
		frame.getContentPane().add(textField_Fila2Letra5);
		
		textField_Fila3Letra1 = new JTextField();
		textField_Fila3Letra1.setEnabled(false);
		textField_Fila3Letra1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila3Letra1.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila3Letra1.setColumns(10);
		textField_Fila3Letra1.setBounds(68, 237, 61, 53);
		frame.getContentPane().add(textField_Fila3Letra1);
		
		textField_Fila3Letra2 = new JTextField();
		textField_Fila3Letra2.setEnabled(false);
		textField_Fila3Letra2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila3Letra2.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila3Letra2.setColumns(10);
		textField_Fila3Letra2.setBounds(158, 237, 61, 53);
		frame.getContentPane().add(textField_Fila3Letra2);
		
		textField_Fila3Letra3 = new JTextField();
		textField_Fila3Letra3.setEnabled(false);
		textField_Fila3Letra3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila3Letra3.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila3Letra3.setColumns(10);
		textField_Fila3Letra3.setBounds(248, 237, 61, 53);
		frame.getContentPane().add(textField_Fila3Letra3);
		
		textField_Fila3Letra4 = new JTextField();
		textField_Fila3Letra4.setEnabled(false);
		textField_Fila3Letra4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila3Letra4.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila3Letra4.setColumns(10);
		textField_Fila3Letra4.setBounds(338, 237, 61, 53);
		frame.getContentPane().add(textField_Fila3Letra4);
		
		textField_Fila3Letra5 = new JTextField();
		textField_Fila3Letra5.setEnabled(false);
		textField_Fila3Letra5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila3Letra5.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila3Letra5.setColumns(10);
		textField_Fila3Letra5.setBounds(428, 237, 61, 53);
		frame.getContentPane().add(textField_Fila3Letra5);
		
		textField_Fila4Letra1 = new JTextField();
		textField_Fila4Letra1.setEnabled(false);
		textField_Fila4Letra1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila4Letra1.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila4Letra1.setColumns(10);
		textField_Fila4Letra1.setBounds(68, 327, 61, 53);
		frame.getContentPane().add(textField_Fila4Letra1);
		
		textField_Fila4Letra2 = new JTextField();
		textField_Fila4Letra2.setEnabled(false);
		textField_Fila4Letra2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila4Letra2.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila4Letra2.setColumns(10);
		textField_Fila4Letra2.setBounds(158, 327, 61, 53);
		frame.getContentPane().add(textField_Fila4Letra2);
		
		textField_Fila4Letra3 = new JTextField();
		textField_Fila4Letra3.setEnabled(false);
		textField_Fila4Letra3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila4Letra3.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila4Letra3.setColumns(10);
		textField_Fila4Letra3.setBounds(248, 327, 61, 53);
		frame.getContentPane().add(textField_Fila4Letra3);
		
		textField_Fila4Letra4 = new JTextField();
		textField_Fila4Letra4.setEnabled(false);
		textField_Fila4Letra4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila4Letra4.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila4Letra4.setColumns(10);
		textField_Fila4Letra4.setBounds(338, 327, 61, 53);
		frame.getContentPane().add(textField_Fila4Letra4);
		
		textField_Fila4Letra5 = new JTextField();
		textField_Fila4Letra5.setEnabled(false);
		textField_Fila4Letra5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila4Letra5.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila4Letra5.setColumns(10);
		textField_Fila4Letra5.setBounds(428, 327, 61, 53);
		frame.getContentPane().add(textField_Fila4Letra5);
		
		textField_Fila5Letra1 = new JTextField();
		textField_Fila5Letra1.setEnabled(false);
		textField_Fila5Letra1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila5Letra1.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila5Letra1.setColumns(10);
		textField_Fila5Letra1.setBounds(68, 417, 61, 53);
		frame.getContentPane().add(textField_Fila5Letra1);
		
		textField_Fila5Letra2 = new JTextField();
		textField_Fila5Letra2.setEnabled(false);
		textField_Fila5Letra2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila5Letra2.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila5Letra2.setColumns(10);
		textField_Fila5Letra2.setBounds(158, 417, 61, 53);
		frame.getContentPane().add(textField_Fila5Letra2);
		
		textField_Fila5Letra3 = new JTextField();
		textField_Fila5Letra3.setEnabled(false);
		textField_Fila5Letra3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila5Letra3.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila5Letra3.setColumns(10);
		textField_Fila5Letra3.setBounds(248, 417, 61, 53);
		frame.getContentPane().add(textField_Fila5Letra3);
		
		textField_Fila5Letra4 = new JTextField();
		textField_Fila5Letra4.setEnabled(false);
		textField_Fila5Letra4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila5Letra4.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila5Letra4.setColumns(10);
		textField_Fila5Letra4.setBounds(338, 417, 61, 53);
		frame.getContentPane().add(textField_Fila5Letra4);
		
		textField_Fila5Letra5 = new JTextField();
		textField_Fila5Letra5.setEnabled(false);
		textField_Fila5Letra5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila5Letra5.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila5Letra5.setColumns(10);
		textField_Fila5Letra5.setBounds(428, 417, 61, 53);
		frame.getContentPane().add(textField_Fila5Letra5);
		
		textField_Fila6Letra1 = new JTextField();
		textField_Fila6Letra1.setEnabled(false);
		textField_Fila6Letra1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila6Letra1.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila6Letra1.setColumns(10);
		textField_Fila6Letra1.setBounds(68, 507, 61, 53);
		frame.getContentPane().add(textField_Fila6Letra1);
		
		textField_Fila6Letra2 = new JTextField();
		textField_Fila6Letra2.setEnabled(false);
		textField_Fila6Letra2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila6Letra2.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila6Letra2.setColumns(10);
		textField_Fila6Letra2.setBounds(158, 507, 61, 53);
		frame.getContentPane().add(textField_Fila6Letra2);
		
		textField_Fila6Letra3 = new JTextField();
		textField_Fila6Letra3.setEnabled(false);
		textField_Fila6Letra3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila6Letra3.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila6Letra3.setColumns(10);
		textField_Fila6Letra3.setBounds(248, 507, 61, 53);
		frame.getContentPane().add(textField_Fila6Letra3);
		
		textField_Fila6Letra4 = new JTextField();
		textField_Fila6Letra4.setEnabled(false);
		textField_Fila6Letra4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila6Letra4.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila6Letra4.setColumns(10);
		textField_Fila6Letra4.setBounds(338, 507, 61, 53);
		frame.getContentPane().add(textField_Fila6Letra4);
		
		textField_Fila6Letra5 = new JTextField();
		textField_Fila6Letra5.setEnabled(false);
		textField_Fila6Letra5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fila6Letra5.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_Fila6Letra5.setColumns(10);
		textField_Fila6Letra5.setBounds(428, 507, 61, 53);
		frame.getContentPane().add(textField_Fila6Letra5);
		
		JLabel etiqueta_ErrorFila1 = new JLabel("");
		etiqueta_ErrorFila1.setForeground(Color.RED);
		etiqueta_ErrorFila1.setFont(new Font("Dialog", Font.BOLD, 12));
		etiqueta_ErrorFila1.setBounds(507, 82, 185, 17);
		frame.getContentPane().add(etiqueta_ErrorFila1);
	
		
		JButton btn_EnviarPalabra = new JButton("Enviar");
		btn_EnviarPalabra.setBounds(222, 617, 105, 27);
		frame.getContentPane().add(btn_EnviarPalabra);
		
		ArrayList<JTextField> fila1 = new ArrayList<JTextField>();
		fila1.add(textField_Fila1Letra1);
		fila1.add(textField_Fila1Letra2);
		fila1.add(textField_Fila1Letra3);
		fila1.add(textField_Fila1Letra4);
		fila1.add(textField_Fila1Letra5);
		
		ArrayList<JTextField> fila2 = new ArrayList<JTextField>();
		fila1.add(textField_Fila2Letra1);
		fila1.add(textField_Fila2Letra2);
		fila1.add(textField_Fila2Letra3);
		fila1.add(textField_Fila2Letra4);
		fila1.add(textField_Fila2Letra5);
		
		ArrayList<JTextField> fila3 = new ArrayList<JTextField>();
		fila1.add(textField_Fila3Letra1);
		fila1.add(textField_Fila3Letra2);
		fila1.add(textField_Fila3Letra3);
		fila1.add(textField_Fila3Letra4);
		fila1.add(textField_Fila3Letra5);
		
		ArrayList<JTextField> fila4 = new ArrayList<JTextField>();
		fila1.add(textField_Fila4Letra1);
		fila1.add(textField_Fila4Letra2);
		fila1.add(textField_Fila4Letra3);
		fila1.add(textField_Fila4Letra4);
		fila1.add(textField_Fila4Letra5);
		
		ArrayList<JTextField> fila5 = new ArrayList<JTextField>();
		fila1.add(textField_Fila5Letra1);
		fila1.add(textField_Fila5Letra2);
		fila1.add(textField_Fila5Letra3);
		fila1.add(textField_Fila5Letra4);
		fila1.add(textField_Fila5Letra5);
		
		
		ArrayList<JTextField> fila6 = new ArrayList<JTextField>();
		fila1.add(textField_Fila6Letra1);
		fila1.add(textField_Fila6Letra2);
		fila1.add(textField_Fila6Letra3);
		fila1.add(textField_Fila6Letra4);
		fila1.add(textField_Fila6Letra5);
		
		
		
		
		textField_Fila1Letra1.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
				if(!textField_Fila1Letra1.getText().isEmpty()) {
					if(textField_Fila1Letra1.getText().length()>1) {
						char letra=textField_Fila1Letra1.getText().charAt(0);
						textField_Fila1Letra1.setText(String.valueOf(letra));
					}
				}
			}
		});
		

		btn_EnviarPalabra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean comprobar=Metodos.ComprobarLetraJTextField(fila1,etiqueta_ErrorFila1);
				if(comprobar) {
				String palabraFila1="";
				Metodos.CrearPalabraFila(fila1,palabraFila1);
				contadorFila++;
				Metodos.DeshabilitarJTextField(fila1);
				}
				
				
				
			}
		});
		
	}
}
