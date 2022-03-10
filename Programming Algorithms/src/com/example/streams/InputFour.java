package com.example.streams;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class InputFour {
		
			FileWriter fw;
			PrintWriter pw;

	public InputFour() {
		
				try {					
					
					fw = new FileWriter("C:/Users/kise/Desktop/file.txt");
				
					pw = new PrintWriter(fw);
					
					pw.write("Time is almost over");
				
					pw.flush();
					
					pw.close();
					
				} catch (IOException e) {
					e.printStackTrace();
				}		
	}
	
	public static void main(String[] args) {
		new InputFour();
	}
}