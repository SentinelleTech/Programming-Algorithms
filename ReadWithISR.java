package com.example.group2201.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadWithISR {
	
	InputStreamReader isr;
	FileInputStream input;
	int val;

	public ReadWithISR() {
		
		try {
			
			input = new FileInputStream("D:\\Enterprise\\output 2.txt");
			
			isr = new InputStreamReader(input);
			
			val = isr.read();
			
			while(val != -1){
				
				char c = (char) val;
								
				System.out.print(c);
				
				val = isr.read();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
			try {
				
				input.close();
				isr.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}	
		
	}
	
	public static void main(String[] args) {
		new ReadWithISR();

	}

}
