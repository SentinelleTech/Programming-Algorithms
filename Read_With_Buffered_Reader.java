package com.example.streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read_With_Buffered_Reader {
	
			BufferedReader br;
			FileReader fr;
			File f;

	public Read_With_Buffered_Reader() {
		
			try {
		
					f = new File("C:/Users/kise/Desktop/reading.txt");
								
					fr = new FileReader(f);
					
					br = new BufferedReader(fr);
					
					String st;
					
					while((st = br.readLine()) != null){
						System.out.println(st);
					}
					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}		
	}
	
	public static void main(String[] args) {
		new Read_With_Buffered_Reader();
	}
}