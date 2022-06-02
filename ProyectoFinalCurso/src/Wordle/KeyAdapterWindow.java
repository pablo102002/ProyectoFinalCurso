package Wordle;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class KeyAdapterWindow implements KeyListener{

	JTextField[][] ArrayTextFields;
	
	public KeyAdapterWindow(JTextField[][] textfields) {
		this.ArrayTextFields=textfields;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		JTextField textField=(JTextField) e.getSource();
		textField.setText(textField.getText().toUpperCase());
		int key = e.getKeyChar();
		
		//variables que tienen como valor (x,y) de el TextField
		int x=Character.getNumericValue(textField.getName().charAt(0));
		int y=Character.getNumericValue(textField.getName().charAt(2));
		if(this.ArrayTextFields[x][y].getText().length()>0) {
			if(y!=4) {
				this.ArrayTextFields[x][y+1].requestFocus();	
			}
		}
		if(key==KeyEvent.VK_BACK_SPACE && textField.getText().isEmpty() ) {
			if(y!=0)
			this.ArrayTextFields[x][y-1].requestFocus();
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		JTextField textField=(JTextField) e.getSource();
		int key = e.getKeyChar();
		
		boolean may = key >= 65 && key <= 90;
		boolean min = key >= 97 && key <= 122;
		int x=Character.getNumericValue(textField.getName().charAt(0));
		int y=Character.getNumericValue(textField.getName().charAt(2));
		
		if (!(min || may) || (textField.getText().length() > 0) ){
	        e.consume();
	    }
	}

}