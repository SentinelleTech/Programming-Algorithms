package com.group_2001.persistence.streams;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
//import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class WriteToFile extends JFrame{
	
	File f;
	//FileOutputStream fos;
	JTextArea txt;
	JButton btn;
	FileWriter fw;
	JScrollPane pane;

	public WriteToFile() {
		super("TextField data");
		setSize(700, 500);
		setLocationRelativeTo(null);
		
		txt = new JTextArea();
		txt.setFont(new Font("Consolas", Font.BOLD, 30));
		txt.setForeground(Color.blue);
		
		pane = new JScrollPane(txt);
		
		btn = new JButton("SEND");
		btn.setFont(new Font("Monotype Corsiva", Font.BOLD, 30));
		btn.setForeground(Color.red);
		btn.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					f = new File("C:/Users/kise/Desktop/file.txt");
					
					boolean created = f.createNewFile();
					
					fw = new FileWriter(f);
					
					txt.write(fw);
					
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
		
		
//		try {
//		
//			f = new File("C:/Users/kise/Pictures/file.txt");
//		
//			boolean created = f.createNewFile();
//			
//			String msg = "Good afternoon class";
//			
//			byte[] b = msg.getBytes();
//			
//			
//				fos = new FileOutputStream(f);
//				fos.write(b, 0, msg.length());
//				
//				fos.close();
//				
//				if(created){
//					
//				}else{
//					System.out.println("Failed!");
//				}
//			
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		add(pane, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new WriteToFile();
	}
}