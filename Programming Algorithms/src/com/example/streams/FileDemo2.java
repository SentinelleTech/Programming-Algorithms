package com.example.streams;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
	
			File f;

	public FileDemo2() {
		
			f = new File("C:\\Users\\kise\\Desktop\\", "demo.txt");
		
		try {
			
			boolean newFile = f.createNewFile();
		
			if(newFile){
				System.out.println("File created");
			}else{
				System.out.println("File not created");
			}
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}	
	
	public static void main(String[] args) {
		new FileDemo2();
	}
}