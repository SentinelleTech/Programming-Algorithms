package com.group_2001.persistence.streams;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class DemoRead2 {
	
	InputStream is;
	InputStreamReader isr;
	BufferedReader br;

	public DemoRead2() {
		
		try {
			
			is = new FileInputStream("C:/Users/kise/Desktop/file.txt");
		
			isr = new InputStreamReader(is);
			
			br = new BufferedReader(isr);
			
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
		new DemoRead2();

	}

}
