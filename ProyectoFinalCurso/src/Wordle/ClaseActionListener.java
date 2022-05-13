package Wordle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;


public class ClaseActionListener implements ActionListener {

    private Ventana vent;
    private JTextField display;

    public void DigitListener(Ventana vent, JTextField display) {
        this.vent = vent;
        this.display = display;
    }

    public void actionPerformed(ActionEvent e) {
    	Metodos.ComprobarLetraJTextField(display);
        
        
    }
}
