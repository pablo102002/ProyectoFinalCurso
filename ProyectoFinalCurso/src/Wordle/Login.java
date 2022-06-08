package Wordle;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Login {

	//Connection to MYSQL
	Connection connection;
	String url=ConnectMYSQL.url;
	String user=ConnectMYSQL.user;
	String password=ConnectMYSQL.password;
	
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
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(133, 463, 349, 331);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("Dialog", Font.BOLD, 26));
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setBounds(12, 17, 132, 55);
		panel.add(lblName);
		
		JLabel lblWins = new JLabel("WINS");
		lblWins.setFont(new Font("Dialog", Font.BOLD, 26));
		lblWins.setHorizontalAlignment(SwingConstants.CENTER);
		lblWins.setBounds(217, 32, 84, 25);
		panel.add(lblWins);
		
		JLabel lbl_Name1 = new JLabel("");
		lbl_Name1.setFont(new Font("Dialog", Font.BOLD, 18));
		lbl_Name1.setBounds(36, 84, 96, 38);
		panel.add(lbl_Name1);
		
		JLabel lbl_Name2 = new JLabel("");
		lbl_Name2.setFont(new Font("Dialog", Font.BOLD, 16));
		lbl_Name2.setBounds(36, 143, 96, 23);
		panel.add(lbl_Name2);
		
		JLabel lbl_Name3 = new JLabel("");
		lbl_Name3.setFont(new Font("Dialog", Font.BOLD, 14));
		lbl_Name3.setBounds(36, 191, 96, 23);
		panel.add(lbl_Name3);
		
		JLabel lbl_Name4 = new JLabel("");
		lbl_Name4.setBounds(36, 243, 60, 17);
		panel.add(lbl_Name4);
		
		JLabel lbl_Name5 = new JLabel("");
		lbl_Name5.setBounds(36, 285, 60, 17);
		panel.add(lbl_Name5);
		
		JLabel lbl_Win1 = new JLabel("");
		lbl_Win1.setFont(new Font("Dialog", Font.BOLD, 18));
		lbl_Win1.setBounds(241, 84, 96, 38);
		panel.add(lbl_Win1);
		
		JLabel lbl_Win2 = new JLabel("");
		lbl_Win2.setFont(new Font("Dialog", Font.BOLD, 16));
		lbl_Win2.setBounds(241, 143, 96, 23);
		panel.add(lbl_Win2);
		
		JLabel lbl_Win3 = new JLabel("");
		lbl_Win3.setFont(new Font("Dialog", Font.BOLD, 14));
		lbl_Win3.setBounds(241, 191, 96, 23);
		panel.add(lbl_Win3);
		
		JLabel lbl_Win4 = new JLabel("");
		lbl_Win4.setBounds(241, 243, 60, 17);
		panel.add(lbl_Win4);
		
		JLabel lbl_Win5 = new JLabel("");
		lbl_Win5.setBounds(241, 285, 60, 17);
		panel.add(lbl_Win5);
		
		frame.setBounds(100, 100, 650, 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		/*
		 * Listener que sirven para que el usuario ponga su nombre(como minimo tiene que tener una 2 letras y maximo 5)
		 * */
		
		ArrayList <JTextField> Name= new ArrayList <JTextField>();
		Name.add(textField_Letter1);
		Name.add(textField_Letter2);
		Name.add(textField_Letter3);
		Name.add(textField_Letter4);
		Name.add(textField_Letter5);
		
		/*
		 * ArrayLists que contienen el nombre y las victorias de los TOP 5
		 */
		ArrayList <JLabel> T5Name = new ArrayList <JLabel>();
		T5Name.add(lbl_Name1);
		T5Name.add(lbl_Name2);
		T5Name.add(lbl_Name3);
		T5Name.add(lbl_Name4);
		T5Name.add(lbl_Name5);
		
		ArrayList <JLabel> T5Win = new ArrayList <JLabel>();
		T5Win.add(lbl_Win1);
		T5Win.add(lbl_Win2);
		T5Win.add(lbl_Win3);
		T5Win.add(lbl_Win4);
		T5Win.add(lbl_Win5);
		
		
		
		ConnectMYSQL.Top5(T5Name,T5Win);
		
		
		KeyListener KeyL=new KeyAdapterLogin(Name);
		
		for(int i=0;i<5;i++) {
			Name.get(i).setName(""+i);
			Name.get(i).addKeyListener(KeyL);
		}
		
		
		/*
		 * Boton que envia los datos a la base de datos y te lleva a la ventana del juego
		 */

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String user=Methods.CreateRowWord(Name);
				System.out.println(user);
				if(user.length()>=1) {

					if (!ConnectMYSQL.checkUser(user)){
						ConnectMYSQL.addUser(user);
					}			

					SelectGameMode s= new SelectGameMode();
					s.frame.setVisible(true);
					frame.dispose();
				}
			}
		});
	}

	
	
}

