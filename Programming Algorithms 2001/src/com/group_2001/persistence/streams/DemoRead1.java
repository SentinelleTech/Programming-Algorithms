package com.group_2001.persistence.streams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoRead1 {
	
	FileReader fr;
	BufferedReader br;

	public DemoRead1() {
		
		try {
			
			fr = new FileReader("C:/Users/kise/Desktop/file.txt");
		
			br = new BufferedReader(fr);
			
			int counter = 0;
			while((counter = br.read()) != -1){
				
				char c = (char) counter;
				
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
		new DemoRead1();

	}

}
