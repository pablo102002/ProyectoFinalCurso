package Wordle;

import java.awt.Color;
import java.util.ArrayList;

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
	
	public static void PonerLetraMayuscula(JTextField letra) {
		letra.setText(letra.getText().toUpperCase());
	} 
	

}
