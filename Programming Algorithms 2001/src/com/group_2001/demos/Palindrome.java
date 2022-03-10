package com.group_2001.demos;

import java.util.Scanner;

public class Palindrome {
	
	Scanner s;
	int x, y;
	String name2; 
	String to_test;
	
	/**
	 * @author Patrick & John
	 */

	public Palindrome() {
		
		System.out.println("Enter a name to test");
		
		s = new Scanner(System.in);
		
		to_test = s.next();
		
		for(int i = to_test.length()-1; i >= 0; i--){
			
			for(int j = 0; j < to_test.length(); j++){
				
				x = to_test.charAt(i);
				y = to_test.charAt(j);
			}
		}
		
		if(x == y){
			
			System.out.println("Palindrome");
		}else{
			System.out.println("Not a palindrome");
		}
		
	}

	
	public static void main(String[] args) {
		new Palindrome();

	}

}
