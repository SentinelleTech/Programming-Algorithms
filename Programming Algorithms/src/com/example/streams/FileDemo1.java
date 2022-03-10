package com.example.streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileDemo1 {
		
			Properties p;
			FileOutputStream fos;
			File f;

	public FileDemo1() {
		
			p = new Properties();
			p.setProperty("John", "12345");
			p.setProperty("Kelvin", "abcd");
			
			f = new File("C:\\Users\\kise\\Desktop\\credentials.properties");
			
			try {
				fos = new FileOutputStream(f);
				
				p.store(fos, "Short remark");
				
				fos.close();
				
				System.out.println("Finished");
			
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}		
	}
	
	public static void main(String[] args) {
		new FileDemo1();
	}
}