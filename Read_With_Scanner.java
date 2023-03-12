package com.example.streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read_With_Scanner {
	
				File f;
				Scanner s;

	public Read_With_Scanner() {
		
		try {
		
				f = new File("C:/Users/kise/Desktop/scan.txt");
		
				s = new Scanner(f);
				
				while(s.hasNextLine()){
					System.out.println(s.nextLine());
				}
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Read_With_Scanner();
	}
}