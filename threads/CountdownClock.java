package com.example.threads;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class CountdownClock extends JFrame {
	
	JLabel lbl;
	Timer timer;
	
	public CountdownClock(){
		super("Countdown Timer");
		setSize(500, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		
		lbl = new JLabel();
		
		timer = new Timer();
		
		timer.scheduleAtFixedRate(new TimerTask(){

			int i = 20;
			
			@Override
			public void run() {
				lbl.setText("Time Left: " + i);
				i--;
				
				if(i < 0){
					timer.cancel();
					lbl.setText("Time Over!");
				}
			}
			
		}, 0, 1000);
		
		add(lbl);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new CountdownClock();

	}

}
