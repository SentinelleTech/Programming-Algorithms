package com.example.streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Write_To_File {
	
			File f;
			FileOutputStream fos;
			byte[] b;

	public Write_To_File() {
		
		try {
		
		f = new File("C:/Users/kise/Desktop/1909/demo.txt");
		
		boolean created = f.createNewFile();
		
		String msg = "BufferedWriter is almost similar to FileWriter but it uses internal buffer to write data into File.";
		
		fos = new FileOutputStream(f);
		
		b = msg.getBytes();
		
		fos.write(b, 0, msg.length());
		
		fos.close();
		
		if(created){
			System.out.println("File created");
		}else{
			System.out.println("File not created");
		}		
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}	
	public static void main(String[] args) {
		new Write_To_File();
	}
}