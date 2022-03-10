package com.demos;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LoadImage extends JFrame{
	
	Dimension d;
	BufferedImage bi;
	File f;
	JLabel lbl;
	URL url;

	public LoadImage() {
		super("Load image");
		d = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(d);
		setDefaultCloseOperation(3);
		
		try {
		
			//f = new File("C:\\Users\\kise\\Desktop\\Sample Pictures\\Jellyfish.jpg");
		
			url = new URL("https://i.pinimg.com/originals/a2/a6/fd/a2a6fd86f350df4ee1c90941afa79677.jpg");
		
			bi = ImageIO.read(url);
			
			lbl = new JLabel(new ImageIcon(bi));
			
			add(lbl);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		setVisible(true);		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new LoadImage();

	}

}
