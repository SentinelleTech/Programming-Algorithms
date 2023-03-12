package com.example.streams;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class Read_And_Write_Image extends JFrame{
	
			File f;
			BufferedImage bi;
			JLabel lbl;
			ImageIcon ic;
			Dimension d;
			JButton btn;

	public Read_And_Write_Image() {
		
		super("Write some text");
		
		d = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(d);
		setDefaultCloseOperation(3);
		
		try {
		
				f = new File("C:/Users/kise/Pictures/Chrysanthemum.jpg");
		
				bi = ImageIO.read(f);
				
				ic = new ImageIcon(bi);
					
		} catch (IOException e) {
			e.printStackTrace();
		}			
		
		lbl = new JLabel(ic);
		
		btn = new JButton("Send");
		btn.setFont(new Font("Times New Roman", Font.BOLD, 40));
		btn.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource() == btn){
					
					try {
						
						boolean created = ImageIO.write(bi, "jpg", new File("C:/Users/kise/Desktop/flower.jpg"));
					
						if(created){
							JOptionPane.showMessageDialog(null, "Photo created");
						}else{
							JOptionPane.showMessageDialog(null, "Photo not created");
						}	
					
					} catch (IOException e1) {
						e1.printStackTrace();
					}					
				}				
			}			
		});
		
		add(btn, BorderLayout.NORTH);
		add(lbl, BorderLayout.SOUTH);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Read_And_Write_Image();
	}
}