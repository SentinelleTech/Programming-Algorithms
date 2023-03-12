package com.example.streams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
	
			Scanner s;
			byte[] buf;
			DataOutputStream dos;
			DataInputStream dis;

	public ReadFile() {
		
		try {
		
		s = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
				
		String str = s.nextLine();
		
		buf = str.getBytes();
		
		dos = new DataOutputStream(new FileOutputStream("C:/Users/kise/Desktop/ours.txt"));
		
		for(byte b : buf){
			
			dos.writeChar(b);
			
		}
		
		dos.flush();
		
		dis = new DataInputStream(new FileInputStream("C:/Users/kise/Desktop/ours.txt"));
		
		while(true){
			char c;
			
			c = dis.readChar();
			
			System.out.println(c);
			
		}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("");
			System.out.println("End of file reached");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	public static void main(String[] args) {
		new ReadFile();
	}
}