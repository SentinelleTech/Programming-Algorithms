package com.example.streams;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Read_Image extends JFrame{
			
			BufferedImage bi;
			File f;			
			Dimension d;

	public Read_Image() {		
		super("Image");
		d = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(d);
		setDefaultCloseOperation(3);
		
		try {
		
			f = new File("C:/Users/kise/Desktop/Sample Pictures/Penguins.jpg");
		
			BufferedImage bi = ImageIO.read(f);
			
			
			
			
			add(new JLabel(new ImageIcon(bi)));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Read_Image();
	}
}