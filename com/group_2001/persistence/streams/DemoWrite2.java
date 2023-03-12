package com.group_2001.persistence.streams;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DemoWrite2 {
	
	FileWriter fw;
	PrintWriter pw;

	public DemoWrite2() {
		
		try {
			
			fw = new FileWriter("C:/Users/kise/Desktop/file2.txt");
		
			pw = new PrintWriter(fw);
			
			pw.write("John");
			pw.write("Ibrahim");
			pw.write("Patrick");
			pw.write("Mark");
			
			pw.flush();
			
			pw.close();
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	public static void main(String[] args) {
		new DemoWrite2();

	}

}
