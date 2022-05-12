package Wordle;

import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class Metodos {
	public static void DeshabilitarJTextField(ArrayList <JTextField> fila) {
		for(int i=0;i<fila.size();i++) {
			fila.get(i).setEnabled(false);
		}
	}
	
	public void HabilitarJTextField(ArrayList <JTextField> fila) {
		for(int i=0;i<fila.size();i++) {
			fila.get(i).setEnabled(true);
		}
	}
	
	//Metodo que sirve para comprobar si un TextField es una letra correcta
	public static boolean ComprobarLetraJTextField(ArrayList <JTextField> fila,JLabel ERROR) {
		for(int i=0;i<fila.size();i++) {
			if(!fila.get(i).getText().isEmpty()) {
				String letra=fila.get(i).getText().toUpperCase();
				if(letra.length()>1) {
					letra=String.valueOf(letra.charAt(0));
					fila.get(i).setText(letra);
					char comprobarletra=letra.charAt(0);
					if(!Character.isLetter(comprobarletra)) {
						return false;
					}
				}
			}
		}
		return true;
	}
	
	public static void CrearPalabraFila(ArrayList <JTextField> f,String palabra) {
		for(int i=0;i<f.size();i++) {
			palabra+=f.get(i).getText();
		}
	}

}
