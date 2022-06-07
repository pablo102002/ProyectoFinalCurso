package Wordle;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JTextField;

public class KeyAdapterLogin implements KeyListener{
	
	ArrayList <JTextField> Name= new ArrayList <JTextField>();

	public KeyAdapterLogin(ArrayList <JTextField> Name) {
		this.Name=Name;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		JTextField textField=(JTextField) e.getSource();
		int key = e.getKeyChar();
		
		//variables que tienen como valor (x,y) de el TextField
		int x=Character.getNumericValue(textField.getName().charAt(0));
		if(Name.get(x).getText().length()>0) {
			if(x!=4) {
			Name.get(x+1).requestFocus();	
			}
		}
		if(key==KeyEvent.VK_BACK_SPACE && textField.getText().isEmpty() ) {
			if(x!=0)
				Name.get(x-1).requestFocus();
		}
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		JTextField textField=(JTextField) e.getSource();
		int key = e.getKeyChar();
		boolean may = key >= 65 && key <= 90;
		boolean min = key >= 97 && key <= 122;
		boolean num = key >= 48 && key <= 57;
		if (!(min || may || num) || (textField.getText().length() > 0) ){
	        e.consume();
	    }
		
	}

}
