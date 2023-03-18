package com.example.group2201.files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoInput {
	
	BufferedReader br;
	InputStreamReader isr;

	public DemoInput() {
		
		isr = new InputStreamReader(System.in);
		
		br = new BufferedReader(isr);
		
		try {
			
			System.out.println("Enter the first number");
			
			int num1 = br.read();
			
			System.out.println("Enter the second number");
			
			int num2 = br.read();
			
			int sum = num1 + num2;
			
			System.out.println(sum);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		new DemoInput();

	}

}
