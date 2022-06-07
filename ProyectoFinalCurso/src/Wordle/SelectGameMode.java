package Wordle;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SelectGameMode  {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectGameMode window = new SelectGameMode();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SelectGameMode() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(204, 255, 204));
		frame.setBounds(100, 100, 650, 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn_PlayOffline = new JButton("Play Offline");
		btn_PlayOffline.setFont(new Font("Dialog", Font.BOLD, 16));
		btn_PlayOffline.setBounds(250, 636, 160, 44);
		frame.getContentPane().add(btn_PlayOffline);
		
		JLabel lblNewLabel = new JLabel("____________________________________________or____________________________________________");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 401, 618, 17);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(186, 56, 289, 56);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblPlayOnline = new JLabel("Play Online");
		lblPlayOnline.setBounds(0, -26, 278, 106);
		panel.add(lblPlayOnline);
		lblPlayOnline.setFont(new Font("Dialog", Font.BOLD, 24));
		lblPlayOnline.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(186, 466, 289, 61);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblPlayOffline = new JLabel("Play Offline");
		lblPlayOffline.setBounds(0, 0, 277, 61);
		panel_1.add(lblPlayOffline);
		lblPlayOffline.setFont(new Font("Dialog", Font.BOLD, 24));
		lblPlayOffline.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btn_PlayOnline = new JButton("Play Online");
		btn_PlayOnline.setFont(new Font("Dialog", Font.BOLD, 16));
		btn_PlayOnline.setBounds(250, 225, 160, 44);
		frame.getContentPane().add(btn_PlayOnline);
		
		btn_PlayOnline.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				WordleOnline w=new WordleOnline();
				w.frame.setVisible(true);
				frame.dispose();
			}
		});
		
		btn_PlayOffline.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				WordleOffline w=new WordleOffline();
				w.frame.setVisible(true);
				frame.dispose();
			}
		});
	}
}
