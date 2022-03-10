package com.example.streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputTwo {
	
			InputStream in;
			Reader r;

	public InputTwo() {
		
			try {
				
				in = new FileInputStream("C:/Users/kise/Desktop/file.txt");
							
				r = new InputStreamReader(in);
				
				int data = r.read();
				
				while(data != -1){
				
				char c = (char) data;
				
				data = r.read();
				
				System.out.print(c);
				
				}			
			
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}
	
	public static void main(String[] args) {
		new InputTwo();
	}
}