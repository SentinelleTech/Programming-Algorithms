package com.example.group2201.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadWithBufferedReader {
	
	//for reading character streams
	BufferedReader br;
	FileReader fr;

	public ReadWithBufferedReader() {
		
		try {
			
			fr = new FileReader("D:\\Enterprise\\output 2.txt");
			
			br = new BufferedReader(fr);
			
			int val = 0;
			
			while((val = br.read()) != -1){
				
				char c = (char) val;
				
				System.out.print(c);
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	public static void main(String[] args) {
		new ReadWithBufferedReader();

	}

}
