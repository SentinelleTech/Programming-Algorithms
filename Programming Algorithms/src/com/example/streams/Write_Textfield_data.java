package com.example.streams;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class Write_Textfield_data extends JFrame implements ActionListener {

			JTextArea txt;
			JButton btn;
			FileWriter fw;
			File f;
			JScrollPane pane;
	
	public Write_Textfield_data(){
		super("Write some text");
		setSize(600, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		
		txt = new JTextArea();
		txt.setFont(new Font("Times New Roman", Font.BOLD, 40));
		
		btn = new JButton("Write");
		btn.addActionListener(this);
		btn.setFont(new Font("Times New Roman", Font.BOLD, 40));
				
		pane = new JScrollPane(txt);
		
		add(pane, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Write_Textfield_data();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btn){
			try {
				
				f = new File("C:/Users/kise/Desktop/1909/textfield.txt");
				
				boolean created = f.createNewFile();
				
				fw = new FileWriter(f);
				
				txt.write(fw);
				
				if(created){
					JOptionPane.showMessageDialog(null, "File created");
					txt.setText("");
				}else{
					JOptionPane.showMessageDialog(null, "File not created");
				}	
				
				fw.close();			
			
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}		
	}
}