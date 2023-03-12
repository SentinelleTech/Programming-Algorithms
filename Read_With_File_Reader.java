package com.example.streams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read_With_File_Reader {
	
			FileReader fr;

	public Read_With_File_Reader() {
		
		try {			
			
			fr = new FileReader("C:/Users/kise/Desktop/reading.txt");
					
			int i;
			
			while((i = fr.read()) != -1){
				
				char c = (char) i;
				
				System.out.print(c);				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public static void main(String[] args) {
		new Read_With_File_Reader();
	}
}