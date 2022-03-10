package com.group_2001.persistence.streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScanDemo {
	
	Scanner s;
	File f;

	public ScanDemo() {
		
		try {
		
			f = new File("C:/Users/kise/Desktop/file.txt");
				
			s = new Scanner(f);
			
			
			while(s.hasNextLine()){
				
				String data = s.nextLine();
				
				System.out.println(data);
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	
	public static void main(String[] args) {
		new ScanDemo();
	}
}