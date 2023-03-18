package com.example.group2201.files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteUsingPrintWriter {
	
	FileWriter writer;
	PrintWriter printWriter;

	public WriteUsingPrintWriter() {
		
		try {
			
			writer = new FileWriter("D:\\Enterprise\\john.txt");
			
			printWriter = new PrintWriter(writer);
			
			printWriter.println("Hello, World!");
			printWriter.println("We just created this file using FileWriter and PrintWriter");
			
			System.out.println("Write operation successful!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
			try {
				
				writer.close();
				printWriter.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
			
			
		}
		
	}

	
	public static void main(String[] args) {
		new WriteUsingPrintWriter();
	}

}
