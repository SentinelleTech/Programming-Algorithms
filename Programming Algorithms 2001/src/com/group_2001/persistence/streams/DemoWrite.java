package com.group_2001.persistence.streams;

import java.io.PrintStream;

public class DemoWrite {
	
	PrintStream ps;

	public DemoWrite() {
		
		ps = new PrintStream(System.out);
		
		ps.println("Hello world");
		
	}
	
	public static void main(String[] args) {
		new DemoWrite();
	}
}