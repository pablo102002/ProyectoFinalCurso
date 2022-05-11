package Wordle;

import java.util.ArrayList;

import javax.swing.JTextField;

public class Metodos {
	public void DeshabilitarJTextField(ArrayList <JTextField> fila) {
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
	public void ComprobarLetraJTextField(ArrayList <JTextField> fila) {
		String letra;
		for(int i=0;i<fila.size();i++) {
			letra=fila.get(i).getText();
			Character letra2=letra.charAt(0);
			if(!Character.isLetter(letra2)) {
				
			}
		}
		
		
	}

}
