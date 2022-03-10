package com.example.streams;

import java.io.PrintStream;

public class InputThree {
	
			PrintStream ps;

	public InputThree() {
		
		ps = new PrintStream(System.err);
		
		ps.println("Hello World!");
		
	}
	
	public static void main(String[] args) {
		new InputThree();
	}
}