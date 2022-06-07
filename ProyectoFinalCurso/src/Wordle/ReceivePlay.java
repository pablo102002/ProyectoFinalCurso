package Wordle;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ReceivePlay extends Thread {
    BufferedReader input;
    public int ContGameOver; 
    ArrayList<JTextField> Array2d;
    JButton btn_Enviar;
    JButton btn_Reset;
    JFrame frame;
  

    public ReceivePlay(BufferedReader input, int ContGameOver, ArrayList<JTextField> Array2d,JButton btn_Enviar, JButton btn_Reset,JFrame frame) {
        this.input = input;
        this.ContGameOver = ContGameOver;
        this.Array2d = Array2d;
        this.btn_Enviar = btn_Enviar;
        this.btn_Reset = btn_Reset;
        this.frame=frame;
    }

    public void run() {
        while (true) {
            try {
                String receivedPlay = input.readLine();
                if(ContGameOver==5) {
                	Methods.EndGame(Array2d,btn_Enviar,btn_Reset,frame);
                }
                
                

            }

            catch (IOException e) {
                System.out.println(e);
            }
        }
    }

}