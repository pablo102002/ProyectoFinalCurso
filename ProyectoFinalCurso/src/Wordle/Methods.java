package Wordle;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
	public static  int CheckCorrectWord(ArrayList<JTextField> fila,String palabra, String palabraResuelta) {
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
			
			ArrayList<Character> LetraAmarilla= new ArrayList<Character>();
			ArrayList<Character> LetraVerde= new ArrayList<Character>();

			for(int i=0;i<charPalabraResuelta.size();i++) {
				//Esta condicion valida si una palabra es correcta, la pone de color verde
				if(charPalabraUsuario.get(i)==charPalabraResuelta.get(i)) {
					fila.get(i).setBackground(Color.GREEN);
					LetraVerde.add(charPalabraUsuario.get(i));
					contador++;
				}
			}

			for(int x=0;x<charPalabraResuelta.size();x++) {
				for(int y=0;y<charPalabraUsuario.size();y++) {
					//Esta condicion sirve para que cuando una letra exista pero no este en la
					//posicion correcta dentro de la palabra correcta se marque de color amarillo
					if((charPalabraUsuario.get(x)==charPalabraResuelta.get(y)) && (fila.get(x).getBackground()!=Color.GREEN)) {
							fila.get(x).setBackground(Color.YELLOW);
							LetraAmarilla.add(charPalabraUsuario.get(x));
					}
				}
			}
			/*
			 * Una vez añadidas las letras de colores a ArrayLists ahora tenemos que compararlas y si se repiten
			 * quitarle el color
			 */
			if(LetraVerde.size()>=1 && LetraAmarilla.size()>=1) {
				for(int i=0;i<LetraVerde.size();i++){
					for(int j=0;j<LetraAmarilla.size();j++) {
						if(LetraAmarilla.get(j)==LetraVerde.get(i)) {
							fila.get(j).setBackground(Color.WHITE);
						}
					}
				}
			}
			
			/*
			 * Este bucle sirve para que cuando la palabra escrita por el usuario contenga 2 letras iguales
			 * y la palabra secreta no, solo mostrara una letra en amarillo ya que si no se sobreentendera que 
			 * la palabra secreta contiene 2 letras iguales
			 */
			for(int i=0;i<LetraAmarilla.size();i++){
				for(int j=0;j<LetraAmarilla.size();j++) {
					if(LetraAmarilla.get(j)==LetraAmarilla.get(i)) {
						fila.get(j).setBackground(Color.WHITE);
						LetraAmarilla.remove(j);
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
	
	public static void Win(JButton btn_Enviar,JLabel Etiqueta_Ganar, boolean Win) {
		Win=true;
		Etiqueta_Ganar.setForeground(Color.GREEN);
		Etiqueta_Ganar.setText("¡Has Ganado!");
		btn_Enviar.setEnabled(false);
	}
	
	public static void Lose(JButton btn_Enviar,JLabel Etiqueta_Ganar) {
		Etiqueta_Ganar.setForeground(Color.RED);
		Etiqueta_Ganar.setText("¡Has Perdido!");
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
	
	public static void EndGame(ArrayList<JTextField> Array2d,JButton btn_Enviar, JButton btn_Reset,JFrame frame) {
		for(int i=0;i<Array2d.size();i++) {
			Array2d.get(i).setEditable(false);
		}
		btn_Enviar.setEnabled(false);
		btn_Reset.setEnabled(false);
		JOptionPane.showInputDialog(frame,"Tu rival ha adivinado 5 palabras antes que tu");
		
	}

}

