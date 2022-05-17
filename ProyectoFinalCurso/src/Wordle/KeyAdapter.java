package Wordle;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;


public abstract class KeyAdapter extends Object implements KeyListener{

    private Ventana vent;
    private JTextField display;

    KeyAdapter(){
    	
    }
 	public void keyTyped(KeyEvent e){
 		
 	}
}
