package com.example.streams;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Input {
	
			BufferedReader br;
			FileReader fr;
			FileInputStream F;

	public Input() {
		
			try {
				fr = new FileReader("C:/Users/kise/Desktop/file.txt");
					
				br = new BufferedReader(fr);
				
				int value = -1;
				
				while((value = br.read()) != 0){
					char c = (char) value;
					
					value += 1;
					
					System.out.print(c);
				}			
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}		
	}
	
	public static void main(String[] args) {
		new Input();
	}
}