package Wordle;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ThreadWordle extends Thread {
	BufferedReader input;
	boolean Win;

	public ThreadWordle(BufferedReader input,boolean Win) {
		this.input = input;
		this.Win = Win;
	}

	public void run() {
		while (true) {
			try {
				String receivedPlay = input.readLine();
				
				if(Win) {
					
				}
				
				
			}

			catch (IOException e) {
				System.out.println(e);
			}
		}
	}
}
    
