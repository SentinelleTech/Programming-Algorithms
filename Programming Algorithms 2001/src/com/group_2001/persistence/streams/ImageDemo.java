package com.group_2001.persistence.streams;


import javax.swing.*;

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


@SuppressWarnings("serial")
public class ImageDemo extends JFrame {
	
	JLabel lbl;
	BufferedImage bi;
	Dimension d;
	File f;
	JButton btn;

	public ImageDemo() {
		super("PHOTO");
		d = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(d);
		setDefaultCloseOperation(3);
		
		try {
			
			f = new File("C:/Users/kise/Pictures/Jellyfish.jpg");		
		
			bi = ImageIO.read(f);
			
			lbl = new JLabel(new ImageIcon(bi));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		btn = new JButton("Save");
		btn.setFont(new Font("Monotype Corsiva", Font.BOLD, 30));
		btn.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				boolean created;
				try {
					created = ImageIO.write(bi, "jpg", new File("C:/Users/kise/Desktop/Samaki.jpg"));
				
					if(created){
						JOptionPane.showMessageDialog(null, "File Created!");
					}else{
						JOptionPane.showMessageDialog(null, "File not created");
					}					
				
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}				
			}			
		});		
		
		add(lbl, BorderLayout.CENTER);
		add(btn, BorderLayout.NORTH);		
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new ImageDemo();
	}
}