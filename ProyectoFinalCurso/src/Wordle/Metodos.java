package Wordle;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Metodos {
	public static void DeshabilitarJTextField(ArrayList <JTextField> fila) {
		for(int i=0;i<fila.size();i++) {
			fila.get(i).setEditable(false);
		}
	}
	
	public static void HabilitarJTextField(ArrayList <JTextField> fila) {
		for(int i=0;i<fila.size();i++) {
			fila.get(i).setEditable(true);
		}
	}
	
	
	public static String CrearPalabraFila(ArrayList <JTextField> f,String palabra) {
		for(int i=0;i<f.size();i++) {
			palabra+=f.get(i).getText();
		}
		return palabra;
	}
	public static  int ComprobarPalabraCorrecta(ArrayList<JTextField> fila,String palabra, String palabraResuelta,JLabel ERROR,int contadorGanar) {
		int contador=0;
		boolean isTrue=true;
		if(palabra.length()!=5) {
			ERROR.setText("Tiene que ser una palabra con 5 letras");
		}
		else {
			ERROR.setText("");
			char [] p=palabra.toCharArray();
			char [] pr=palabraResuelta.toCharArray();
			char Digit0=pr[0];
			int contadorDigit0=0;
			char Digit1=pr[1];
			int contadorDigit1=0;
			char Digit2=pr[2];
			int contadorDigit2=0;
			char Digit3=pr[3];
			int contadorDigit3=0;
			char Digit4=pr[4];
			int contadorDigit4=0;
			for(int x=0;x<5;x++) {
				if(Digit0==pr[x]) {
					contadorDigit0++;
				}
				if(Digit1==pr[x]) {
					contadorDigit1++;
				}
				if(Digit2==pr[x]) {
					contadorDigit2++;
				}
				if(Digit3==pr[x]) {
					contadorDigit3++;
				}
				if(Digit4==pr[x]) {
					contadorDigit4++;
				}	
			}
			ArrayList<Integer> Contadores=new ArrayList<Integer>();
			Contadores.add(contadorDigit0);
			Contadores.add(contadorDigit1);
			Contadores.add(contadorDigit2);
			Contadores.add(contadorDigit3);
			Contadores.add(contadorDigit4);
			
			
			for(int i=0;i<pr.length;i++) {
				isTrue=true;
				for(int j=0;j<p.length && isTrue;j++) {
					//Esta condicion sirve para que cuando una letra exista pero no este en la
					//posicion correcta dentro de la palabra correcta se marque de color amarillo
					if(p[i]==pr[j]) {
						fila.get(i).setBackground(Color.YELLOW);
					}
					//Esta condicion sirve para  que cuando la letra este en la posicion correcta
					//se marque de verder y se salga del bucle ya que no le hace falta verificar nada mas
					if(p[i]==pr[i]) {
						fila.get(i).setBackground(Color.GREEN);
						contador++;
						isTrue=false;
					}
				}
			}
		}
		return contador;
	}
	
	
	public static void PonerLetraGris(ArrayList<JTextField> fila) {
		for(int i=0;i<5;i++) {
			if(fila.get(i).getBackground()!=Color.YELLOW && fila.get(i).getBackground()!=Color.GREEN) {
				fila.get(i).setBackground(new Color(205,205,205));
			}
		}
	}
	
	public static void HasGanado(JButton btn_Enviar,JLabel Etiqueta_Ganar) {
		Etiqueta_Ganar.setForeground(Color.GREEN);
		Etiqueta_Ganar.setText("¡Has Ganado!");
		btn_Enviar.setEnabled(false);
	}
	
	public static void HasPerdido(JButton btn_Enviar,JLabel Etiqueta_Ganar) {
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

}

