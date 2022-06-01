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

public class Login {

	private JFrame frame;
	private JTextField textField_Name;

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
		
		textField_Name = new JTextField();
		textField_Name.setBounds(223, 221, 186, 36);
		frame.getContentPane().add(textField_Name);
		textField_Name.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("¡WELCOME TO WORDLE!");
		lblNewLabel.setFont(new Font("Monospaced", Font.BOLD, 36));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(44, 12, 520, 111);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Type your name:");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_1.setBounds(61, 218, 144, 36);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("TOP 5 PLAYERS");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 26));
		lblNewLabel_2.setBounds(212, 408, 260, 30);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setBounds(459, 225, 105, 27);
		frame.getContentPane().add(btnNewButton);
		frame.setBounds(100, 100, 650, 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*
		 * Boton que envia los datos a la base de datos y te lleva a la ventana del juego
		 */
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Ventana t= new Ventana();
				t.frame.setVisible(true);
			}
		});
	}
}
