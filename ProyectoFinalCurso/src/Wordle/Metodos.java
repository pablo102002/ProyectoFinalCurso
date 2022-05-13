package Wordle;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class Metodos {
	public static void DeshabilitarJTextField(ArrayList <JTextField> fila) {
		for(int i=0;i<fila.size();i++) {
			fila.get(i).setEnabled(false);
		}
	}
	
	public static void HabilitarJTextField(ArrayList <JTextField> fila) {
		for(int i=0;i<fila.size();i++) {
			fila.get(i).setEnabled(true);
		}
	}
	
	
	public static String CrearPalabraFila(ArrayList <JTextField> f,String palabra) {
		for(int i=0;i<f.size();i++) {
			palabra+=f.get(i).getText();
		}
		return palabra;
	}
	public static  void ComprobarPalabraCorrecta(ArrayList<JTextField> fila,String palabra, String palabraResuelta) {
		boolean isTrue=true;
		char [] p=palabra.toCharArray();
		System.out.println(p.length);
		char [] pr=palabraResuelta.toCharArray();
		System.out.println(pr.length);
		for(int i=0;i<pr.length-1;i++) {
			isTrue=true;
			for(int j=0;j<p.length-1 && isTrue;j++) {
				if(p[j]==pr[i]) {
					fila.get(i).setBackground(Color.YELLOW);
				}
				if(p[i]==pr[i]) {
					fila.get(i).setBackground(Color.GREEN);
					isTrue=false;
				}
			}
		}
	}
	

}
