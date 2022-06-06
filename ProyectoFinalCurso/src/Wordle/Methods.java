package Wordle;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Methods {
	public static void DisableJTextField(ArrayList <JTextField> fila) {
		for(int i=0;i<fila.size();i++) {
			fila.get(i).setEditable(false);
		}
	}
	
	public static void EnableJTextField(ArrayList <JTextField> fila) {
		for(int i=0;i<fila.size();i++) {
			fila.get(i).setEditable(true);
		}
	}
	
	
	public static String CreateRowWord(ArrayList <JTextField> f) {
		String palabra="";
		for(int i=0;i<f.size();i++) {
			palabra+=f.get(i).getText();
		}
		return palabra;
	}
	public static  int CheckCorrectWord(ArrayList<JTextField> fila,String palabra, String palabraResuelta,int contadorGanar) {
		int contador=0;
	
			char [] p=palabra.toCharArray();
			char [] pr=palabraResuelta.toCharArray();
			ArrayList<Character> charPalabraResuelta= new ArrayList<Character>();
			charPalabraResuelta.add(pr[0]);
			charPalabraResuelta.add(pr[1]);
			charPalabraResuelta.add(pr[2]);
			charPalabraResuelta.add(pr[3]);
			charPalabraResuelta.add(pr[4]);
			ArrayList<Character> charPalabraUsuario= new ArrayList<Character>();
			charPalabraUsuario.add(p[0]);
			charPalabraUsuario.add(p[1]);
			charPalabraUsuario.add(p[2]);
			charPalabraUsuario.add(p[3]);
			charPalabraUsuario.add(p[4]);
			

			for(int i=0;i<charPalabraResuelta.size();i++) {
				//Esta condicion valida si una palabra es correcta, la pone de colorr vere y la borra
				//del array para que no vuelva a aparecer
				if(charPalabraUsuario.get(i)==charPalabraResuelta.get(i)) {
					fila.get(i).setBackground(Color.GREEN);
					contador++;
				}
			}
			int contEqualLetters=0;
			for(int x=0;x<charPalabraResuelta.size();x++) {
				for(int y=0;y<charPalabraUsuario.size();y++) {
					//Esta condicion sirve para que cuando una letra exista pero no este en la
					//posicion correcta dentro de la palabra correcta se marque de color amarillo
					if((charPalabraUsuario.get(x)==charPalabraResuelta.get(y)) && (fila.get(x).getBackground()!=Color.GREEN)) {
						for(int j=0;j<fila.size();j++) {
							if(charPalabraUsuario.get(x)==charPalabraUsuario.get(j))
								contEqualLetters++;
						}
						if(contEqualLetters==1) {
							fila.get(x).setBackground(Color.YELLOW);
						}
					}
				}
			}
			return contador;
	}

	
	public static void PutGrayLetter(ArrayList<JTextField> fila) {
		for(int i=0;i<5;i++) {
			if(fila.get(i).getBackground()!=Color.YELLOW && fila.get(i).getBackground()!=Color.GREEN) {
				fila.get(i).setBackground(new Color(205,205,205));
			}
		}
	}
	
	public static void Win(JButton btn_Enviar,JLabel Etiqueta_Ganar) {
		Etiqueta_Ganar.setForeground(Color.GREEN);
		Etiqueta_Ganar.setText("¡You Won!");
		btn_Enviar.setEnabled(false);
	}
	
	public static void Lose(JButton btn_Enviar,JLabel Etiqueta_Ganar) {
		Etiqueta_Ganar.setForeground(Color.RED);
		Etiqueta_Ganar.setText("¡You Lose !");
		btn_Enviar.setEnabled(false);
	}

	public static void ResetGame(ArrayList<JTextField> Array2d,JButton btn_Enviar,JLabel Etiqueta_Ganar) {
		for(int i=0;i<Array2d.size();i++) {
			Array2d.get(i).setBackground(Color.WHITE);
			if(i<=4) {
				Array2d.get(i).setEditable(true);
			}
			else {
				Array2d.get(i).setEditable(false);
				
			}
			Array2d.get(i).setText("");
		}
		btn_Enviar.setEnabled(true);
		Etiqueta_Ganar.setText("");
	}

}

