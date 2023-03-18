package com.example.group2201.files;

import java.io.PrintStream;

public class OutputWithPrintStream {
	
	PrintStream ps;

	public OutputWithPrintStream() {
		
		ps = new PrintStream(System.out);
		
		ps.print("Hello, World!");
		ps.close();
		
	}

	
	public static void main(String[] args) {
		new OutputWithPrintStream();

	}

}
