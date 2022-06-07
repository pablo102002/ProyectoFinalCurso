package Wordle;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.CaretListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
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
import javax.swing.JOptionPane;

import java.awt.Color;

public class WordleOffline {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	protected int ContRow=0;
	protected int ContVictory=0;
	protected int ContGameOver=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WordleOffline window = new WordleOffline();
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
	public WordleOffline() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(204, 255, 204));
		frame.setBounds(100, 100, 650, 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_Juego = new JPanel();
		panel_Juego.setBackground(new Color(204, 255, 204));
		panel_Juego.setBounds(132, 98, 375, 422);
		frame.getContentPane().add(panel_Juego);
		panel_Juego.setLayout(new GridLayout(6, 5, 10, 10));
		
		JButton btn_Enviar = new JButton("Send");
		btn_Enviar.setBounds(264, 562, 105, 27);
		frame.getContentPane().add(btn_Enviar);
		
		JLabel lbl_ErrorLetter = new JLabel("");
		lbl_ErrorLetter.setFont(new Font("Dialog", Font.BOLD, 20));
		lbl_ErrorLetter.setForeground(Color.RED);
		lbl_ErrorLetter.setBounds(45, 601, 408, 45);
		frame.getContentPane().add(lbl_ErrorLetter);
		
		JLabel Etiqueta_Ganar = new JLabel("");
		Etiqueta_Ganar.setHorizontalAlignment(SwingConstants.CENTER);
		Etiqueta_Ganar.setFont(new Font("Dialog", Font.BOLD, 26));
		Etiqueta_Ganar.setForeground(Color.GREEN);
		Etiqueta_Ganar.setBounds(156, 642, 304, 55);
		frame.getContentPane().add(Etiqueta_Ganar);
		
		JLabel letraOculta = new JLabel("");
		letraOculta.setFont(new Font("Dialog", Font.BOLD, 26));
		letraOculta.setBounds(26, 714, 580, 91);
		frame.getContentPane().add(letraOculta);
		
			JButton btn_Help = new JButton("");
			btn_Help.setBounds(519, 98, 68, 27);
			btn_Help.setIcon(new ImageIcon(WordleOffline.class.getResource("/img/icons8-acerca-de-17.png")));
			frame.getContentPane().add(btn_Help);
	
			btn_Help.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Icon icono = new ImageIcon(getClass().getResource("/img/RulesWordle.png"));
	
					JOptionPane.showMessageDialog(
							frame, icono, 
							"RULES",
							JOptionPane.PLAIN_MESSAGE);
				}
			});
			
		
		/*
		 * ArrayList la cual contiene las posibles palabras a adivinar
		 */
		ArrayList<String> GuessWord = new ArrayList<String>();
		GuessWord.add("HUESO");
		GuessWord.add("TIMAR");
		GuessWord.add("MIRAS");
		GuessWord.add("HACER");
		GuessWord.add("FLIPO");
		GuessWord.add("TRAES");
		GuessWord.add("OSTRA");
		GuessWord.add("LIMON");
		GuessWord.add("RATON");
		GuessWord.add("PADRE");
		GuessWord.add("JUGAR");
		GuessWord.add("JABON");
		GuessWord.add("CHICA");
		GuessWord.add("SILBA");
		GuessWord.add("VAPOR");
		GuessWord.add("PESTO");
		GuessWord.add("NINJA");
		GuessWord.add("NOCHE");
		GuessWord.add("MIXTO");
		GuessWord.add("LUEGO");
		
		/*
		 * Aqui sacamos la palabra secreta mediante un numero random
		 */
	
		int number = (int)(Math.random()*GuessWord.size()-1+1);
		String SecretWord=GuessWord.get(number);
		System.out.println(SecretWord);

		
		
		/*
		 * Este ArrayList permite conprobar si una palabra es coherente
		 */

		ArrayList<String> dictionary = new ArrayList<>();
		try (BufferedReader reader = new BufferedReader(new FileReader("./files/5letras.txt"))) {

			while (reader.ready()) {
				dictionary.add(reader.readLine());
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
		ArrayList<JTextField> row1 = new ArrayList<JTextField>();
		ArrayList<JTextField> row2 = new ArrayList<JTextField>();
		ArrayList<JTextField> row3 = new ArrayList<JTextField>();
		ArrayList<JTextField> row4 = new ArrayList<JTextField>();
		ArrayList<JTextField> row5 = new ArrayList<JTextField>();
		ArrayList<JTextField> row6 = new ArrayList<JTextField>();

		//Crear los JTexfields mediante un bucle
		JTextField[][] ArrayWordle=new JTextField[6][5];
		KeyListener KeyL=new KeyAdapterGame(ArrayWordle);

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
					row1.add(ArrayWordle[i][j]);
					break;
				case 1: 
					row2.add(ArrayWordle[i][j]);
					break;
				case 2:
					row3.add(ArrayWordle[i][j]);
					break;
				case 3: 
					row4.add(ArrayWordle[i][j]);
					break;
				case 4: 
					row5.add(ArrayWordle[i][j]);
					break;
				case 5: 
					row6.add(ArrayWordle[i][j]);
					break;
				}

			}
		}

		btn_Enviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int contadorGanar=0;

				switch (ContRow) {
				case 0: 
					String rowWord1=Methods.CreateRowWord(row1);
					if(rowWord1.length()!=5) {
						lbl_ErrorLetter.setText("It has to be a word with 5 letters");
					}
					else {
						lbl_ErrorLetter.setText("");
						if(dictionary.contains(rowWord1)) {
							contadorGanar=Methods.CheckCorrectWord(row1,rowWord1,SecretWord);
							if(contadorGanar==5) {
								ContGameOver++;
								ContVictory++;
								Methods.DisableJTextField(row1);
								Methods.PutGrayLetter(row1);
								Methods.Win(btn_Enviar, Etiqueta_Ganar);
							}
							else if(rowWord1.length()==5) {
								Methods.PutGrayLetter(row1);
								contadorGanar=0;
								ContRow++;
								Methods.DisableJTextField(row1);
								Methods.EnableJTextField(row2);
								row2.get(0).requestFocus();
							}
						}
						else {
							lbl_ErrorLetter.setText("The word doesn't exist");
						}
					}
					;
					break;
				case 1: 
					String rowWord2=Methods.CreateRowWord(row2);
					if(rowWord2.length()!=5) {
						lbl_ErrorLetter.setText("It has to be a word with 5 letters");
					}
					else {
						lbl_ErrorLetter.setText("");
						if(dictionary.contains(rowWord2)) {
							contadorGanar=Methods.CheckCorrectWord(row2,rowWord2,SecretWord);
							if(contadorGanar==5) {
								ContGameOver++;
								ContVictory++;
								Methods.DisableJTextField(row2);
								Methods.PutGrayLetter(row2);
								Methods.Win(btn_Enviar, Etiqueta_Ganar);
							}
							else if(rowWord2.length()==5) {
								Methods.PutGrayLetter(row2);
								contadorGanar=0;
								ContRow++;
								Methods.DisableJTextField(row2);
								Methods.EnableJTextField(row3);
								row3.get(0).requestFocus();
							}
						}
						else {
							lbl_ErrorLetter.setText("The word doesn't exist");
						}
					};
					break;
				case 2:  
					String rowWord3=Methods.CreateRowWord(row3);
					if(rowWord3.length()!=5) {
						lbl_ErrorLetter.setText("It has to be a word with 5 letters");
					}
					else {
						lbl_ErrorLetter.setText("");
						if(dictionary.contains(rowWord3)) {
							contadorGanar=Methods.CheckCorrectWord(row3,rowWord3,SecretWord);
							if(contadorGanar==5) {
								ContGameOver++;
								ContVictory++;
								Methods.DisableJTextField(row3);
								Methods.PutGrayLetter(row3);
								Methods.Win(btn_Enviar, Etiqueta_Ganar);
							}
							else if(rowWord3.length()==5) {
								Methods.PutGrayLetter(row3);
								contadorGanar=0;
								ContRow++;
								Methods.DisableJTextField(row3);
								Methods.EnableJTextField(row4);
								row4.get(0).requestFocus();
							}
						}
						else {
							lbl_ErrorLetter.setText("The word doesn't exist");
						}
					}
					;
					break;
				case 3:
					String rowWord4=Methods.CreateRowWord(row4);
					if(rowWord4.length()!=5) {
						lbl_ErrorLetter.setText("It has to be a word with 5 letters");
					}
					else {
						lbl_ErrorLetter.setText("");
						if(dictionary.contains(rowWord4)) {
							contadorGanar=Methods.CheckCorrectWord(row4,rowWord4,SecretWord);

							if(contadorGanar==5) {
								ContGameOver++;
								ContVictory++;
								Methods.DisableJTextField(row4);
								Methods.PutGrayLetter(row4);
								Methods.Win(btn_Enviar, Etiqueta_Ganar);
							}
							else if(rowWord4.length()==5) {
								Methods.PutGrayLetter(row4);
								contadorGanar=0;
								ContRow++;
								Methods.DisableJTextField(row4);
								Methods.EnableJTextField(row5);
								row5.get(0).requestFocus();
							}
						}
						else {
							lbl_ErrorLetter.setText("The word doesn't exist");
						}
					};
					break;
				case 4: 
					String rowWord5=Methods.CreateRowWord(row5);
					if(rowWord5.length()!=5) {
						lbl_ErrorLetter.setText("It has to be a word with 5 letters");
					}
					else {
						lbl_ErrorLetter.setText("");
						if(dictionary.contains(rowWord5)) {
							contadorGanar=Methods.CheckCorrectWord(row5,rowWord5,SecretWord);
							if(contadorGanar==5) {
								ContGameOver++;
								ContVictory++;
								Methods.DisableJTextField(row5);
								Methods.PutGrayLetter(row5);
								Methods.Win(btn_Enviar, Etiqueta_Ganar);
							}
							else if(rowWord5.length()==5) {
								Methods.PutGrayLetter(row5);
								contadorGanar=0;
								ContRow++;
								Methods.DisableJTextField(row5);
								Methods.EnableJTextField(row6);
								row6.get(0).requestFocus();
							}
						}
						else {
							lbl_ErrorLetter.setText("The word doesn't exist");
						}
					}
					;
					break;
				case 5: 
					String rowWord6=Methods.CreateRowWord(row6);
					if(rowWord6.length()!=5) {
						lbl_ErrorLetter.setText("It has to be a word with 5 letters");
					}
					else {
						lbl_ErrorLetter.setText("");
						if(dictionary.contains(rowWord6)) {
							contadorGanar=Methods.CheckCorrectWord(row6,rowWord6,SecretWord);
							if(contadorGanar==5) {
								ContGameOver++;
								ContVictory++;
								Methods.DisableJTextField(row6);
								Methods.PutGrayLetter(row6);
								Methods.Win(btn_Enviar, Etiqueta_Ganar);
							}
							else if(rowWord6.length()==5) {
								Methods.PutGrayLetter(row6);
								contadorGanar=0;
								ContRow++;
								Methods.DisableJTextField(row6);
								Methods.Lose(btn_Enviar, Etiqueta_Ganar);
								letraOculta.setText("La palabra es: \""+SecretWord+"\"");
							}
						}
						else {
							lbl_ErrorLetter.setText("The word doesn't exist");
						}
					}
					;
					break;
				}
			}
		});

		/*
		 * LISTENER PARA LA EL ENTER FILA1
		 */

		row1.get(4).addKeyListener(new KeyAdapterGame(ArrayWordle) {
			@Override
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyChar();
				if(key==KeyEvent.VK_ENTER) {
					int contadorGanar=0;
					String rowWord1=Methods.CreateRowWord(row1);
					if(rowWord1.length()!=5) {
						lbl_ErrorLetter.setText("It has to be a word with 5 letters");
					}
					else {
						lbl_ErrorLetter.setText("");
						if(dictionary.contains(rowWord1)) {
							System.out.println(rowWord1);
							contadorGanar=Methods.CheckCorrectWord(row1,rowWord1,SecretWord);
							System.out.println("Cont: "+contadorGanar);
							if(contadorGanar==5) {
								ContGameOver++;
								ContVictory++;
								Methods.DisableJTextField(row1);
								Methods.PutGrayLetter(row1);
								Methods.Win(btn_Enviar, Etiqueta_Ganar);
							}
							else if(rowWord1.length()==5) {
								Methods.PutGrayLetter(row1);
								contadorGanar=0;
								ContRow++;
								Methods.DisableJTextField(row1);
								Methods.EnableJTextField(row2);
								row2.get(0).requestFocus();
							}
						}
						else {
							lbl_ErrorLetter.setText("The word doesn't exist");
						}	
					}
				}
			}
		});

		/*
		 * LISTENER PARA LA EL ENTER FILA2
		 */

		row2.get(4).addKeyListener(new KeyAdapterGame(ArrayWordle) {
			@Override
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyChar();
				if(key==KeyEvent.VK_ENTER) {
					int contadorGanar=0;
					String rowWord2=Methods.CreateRowWord(row2);
					if(rowWord2.length()!=5) {
						lbl_ErrorLetter.setText("It has to be a word with 5 letters");
					}
					else {
						lbl_ErrorLetter.setText("");
						if(dictionary.contains(rowWord2)) {
							contadorGanar=Methods.CheckCorrectWord(row2,rowWord2,SecretWord);
							if(contadorGanar==5) {
								ContGameOver++;
								ContVictory++;
								Methods.DisableJTextField(row1);
								Methods.PutGrayLetter(row1);
								Methods.Win(btn_Enviar, Etiqueta_Ganar);
							}
							else if(rowWord2.length()==5) {
								Methods.PutGrayLetter(row2);
								contadorGanar=0;
								ContRow++;
								Methods.DisableJTextField(row2);
								Methods.EnableJTextField(row3);
								row3.get(0).requestFocus();
							}
						}
						else {
							lbl_ErrorLetter.setText("The word doesn't exist");
						}
					}
				}
			}
		});

		/*
		 * LISTENER PARA LA EL ENTER FILA3
		 */

		row3.get(4).addKeyListener(new KeyAdapterGame(ArrayWordle) {
			@Override
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyChar();
				if(key==KeyEvent.VK_ENTER) {
					int contadorGanar=0;
					String rowWord3=Methods.CreateRowWord(row3);
					if(rowWord3.length()!=5) {
						lbl_ErrorLetter.setText("It has to be a word with 5 letters");
					}
					else {
						lbl_ErrorLetter.setText("");
						if(dictionary.contains(rowWord3)) {
							contadorGanar=Methods.CheckCorrectWord(row3,rowWord3,SecretWord);
							if(contadorGanar==5) {
								ContGameOver++;
								ContVictory++;
								Methods.DisableJTextField(row3);
								Methods.PutGrayLetter(row3);
								Methods.Win(btn_Enviar, Etiqueta_Ganar);
							}
							else if(rowWord3.length()==5) {
								Methods.PutGrayLetter(row3);
								contadorGanar=0;
								ContRow++;
								Methods.DisableJTextField(row3);
								Methods.EnableJTextField(row4);
								row4.get(0).requestFocus();
							}
						}

						else {
							lbl_ErrorLetter.setText("The word doesn't exist");
						}	
					}
				}
			}
		});

		/*
		 * LISTENER PARA LA EL ENTER FILA4
		 */

		row4.get(4).addKeyListener(new KeyAdapterGame(ArrayWordle) {
			@Override
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyChar();
				if(key==KeyEvent.VK_ENTER) {
					int contadorGanar=0;
					String rowWord4=Methods.CreateRowWord(row4);
					if(rowWord4.length()!=5) {
						lbl_ErrorLetter.setText("It has to be a word with 5 letters");
					}
					else {
						lbl_ErrorLetter.setText("");
						if(dictionary.contains(rowWord4)) {
							contadorGanar=Methods.CheckCorrectWord(row4,rowWord4,SecretWord);
							if(contadorGanar==5) {
								ContGameOver++;
								ContVictory++;
								Methods.DisableJTextField(row4);
								Methods.PutGrayLetter(row4);
								Methods.Win(btn_Enviar, Etiqueta_Ganar);
							}
							else if(rowWord4.length()==5) {
								Methods.PutGrayLetter(row4);
								contadorGanar=0;
								ContRow++;
								Methods.DisableJTextField(row4);
								Methods.EnableJTextField(row5);
								row5.get(0).requestFocus();
							}


						}
						else {
							lbl_ErrorLetter.setText("The word doesn't exist");
						}	
					}
				}
			}
		});

		/*
		 * LISTENER PARA LA EL ENTER FILA5
		 */

		row5.get(4).addKeyListener(new KeyAdapterGame(ArrayWordle) {
			@Override
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyChar();
				if(key==KeyEvent.VK_ENTER) {
					int contadorGanar=0;
					String rowWord5=Methods.CreateRowWord(row5);
					if(rowWord5.length()!=5) {
						lbl_ErrorLetter.setText("It has to be a word with 5 letters");
					}
					else {
						lbl_ErrorLetter.setText("");
						if(dictionary.contains(rowWord5)) {
							contadorGanar=Methods.CheckCorrectWord(row5,rowWord5,SecretWord);
							if(contadorGanar==5) {
								ContGameOver++;
								ContVictory++;
								Methods.DisableJTextField(row5);
								Methods.PutGrayLetter(row5);
								Methods.Win(btn_Enviar, Etiqueta_Ganar);
							}
							else if(rowWord5.length()==5) {
								Methods.PutGrayLetter(row5);
								contadorGanar=0;
								ContRow++;
								Methods.DisableJTextField(row5);
								Methods.EnableJTextField(row6);
								row6.get(0).requestFocus();
							}


						}
						else {
							lbl_ErrorLetter.setText("The word doesn't exist");
						}	
					}
				}
			}
		});

		/*
		 * LISTENER PARA LA EL ENTER FILA6
		 */

		row6.get(4).addKeyListener(new KeyAdapterGame(ArrayWordle) {
			@Override
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyChar();
				if(key==KeyEvent.VK_ENTER) {
					int contadorGanar=0;
					String rowWord6=Methods.CreateRowWord(row6);
					if(rowWord6.length()!=5) {
						lbl_ErrorLetter.setText("It has to be a word with 5 letters");
					}
					else {
						lbl_ErrorLetter.setText("");
						if(dictionary.contains(rowWord6)) {
							contadorGanar=Methods.CheckCorrectWord(row6,rowWord6,SecretWord);
							if(contadorGanar==5) {
								ContGameOver++;
								ContVictory++;
								Methods.DisableJTextField(row6);
								Methods.PutGrayLetter(row6);
								Methods.Win(btn_Enviar, Etiqueta_Ganar);
							}
							else if(rowWord6.length()==5) {
								Methods.PutGrayLetter(row6);
								contadorGanar=0;
								ContRow++;
								Methods.DisableJTextField(row6);
								Methods.Lose(btn_Enviar, Etiqueta_Ganar);
								letraOculta.setText("The correct word is: \""+SecretWord+"\"");
							}


						}
						else {
							lbl_ErrorLetter.setText("The word doesn't exist");
						}	
					}
				}
			}
		});
		
		
		
	}
}


