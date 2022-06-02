package Wordle;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Login {

	private JFrame frame;
	private JTextField textField_Letter1;
	private JTextField textField_Letter2;
	private JTextField textField_Letter3;
	private JTextField textField_Letter4;
	private JTextField textField_Letter5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(204, 255, 204));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("¡WELCOME TO WORDLE!");
		lblNewLabel.setFont(new Font("Monospaced", Font.BOLD, 36));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(44, 12, 520, 86);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Type your name:");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_1.setBounds(233, 179, 144, 36);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("TOP 5 PLAYERS");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 26));
		lblNewLabel_2.setBounds(212, 408, 260, 30);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setBounds(254, 353, 105, 27);
		frame.getContentPane().add(btnNewButton);
		
		textField_Letter1 = new JTextField();
		textField_Letter1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Letter1.setFont(new Font("Dialog", Font.PLAIN, 30));
		textField_Letter1.setBounds(70, 250, 74, 69);
		frame.getContentPane().add(textField_Letter1);
		textField_Letter1.setColumns(10);
		
		textField_Letter2 = new JTextField();
		textField_Letter2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Letter2.setFont(new Font("Dialog", Font.PLAIN, 30));
		textField_Letter2.setColumns(10);
		textField_Letter2.setBounds(171, 250, 74, 69);
		frame.getContentPane().add(textField_Letter2);
		
		textField_Letter3 = new JTextField();
		textField_Letter3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Letter3.setFont(new Font("Dialog", Font.PLAIN, 30));
		textField_Letter3.setColumns(10);
		textField_Letter3.setBounds(272, 250, 74, 69);
		frame.getContentPane().add(textField_Letter3);
		
		textField_Letter4 = new JTextField();
		textField_Letter4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Letter4.setFont(new Font("Dialog", Font.PLAIN, 30));
		textField_Letter4.setColumns(10);
		textField_Letter4.setBounds(381, 250, 74, 69);
		frame.getContentPane().add(textField_Letter4);
		
		textField_Letter5 = new JTextField();
		textField_Letter5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Letter5.setFont(new Font("Dialog", Font.PLAIN, 30));
		textField_Letter5.setColumns(10);
		textField_Letter5.setBounds(484, 250, 74, 69);
		frame.getContentPane().add(textField_Letter5);
		frame.setBounds(100, 100, 650, 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*
		 * Boton que envia los datos a la base de datos y te lleva a la ventana del juego
		 */
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Ventana t= new Ventana();
				t.frame.setVisible(true);
				frame.dispose();
			}
		});
		
		
		/*
		 * Listener que sirven para que el usuario ponga su nombre(como minimo tiene que tener una 2 letras y maximo 5)
		 * */
		
		ArrayList <JTextField> Name= new ArrayList <JTextField>();
		Name.add(textField_Letter1);
		Name.add(textField_Letter2);
		Name.add(textField_Letter3);
		Name.add(textField_Letter4);
		Name.add(textField_Letter5);
		
		
		KeyListener KeyL=new KeyAdapterLogin(Name);
		
		for(int i=0;i<5;i++) {
			Name.get(i).setName(""+i);
			Name.get(i).addKeyListener(KeyL);
		}
		
		
	}
}
