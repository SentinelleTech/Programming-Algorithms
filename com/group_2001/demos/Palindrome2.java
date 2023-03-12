package com.group_2001.demos;

import java.util.Scanner;

public class Palindrome2 {
	
	Scanner s;
	String name2; 
	String to_test;
	String name = "";
	
	/**
	 * @author Mark Murimi
	 */

	public Palindrome2() {
		
		System.out.println("Enter a name to test");
		
		s = new Scanner(System.in);
		
		to_test = s.next();
		
		name2 = to_test;
		
		for(int i = to_test.length()-1; i >= 0; i--){
			
			
			name = name + to_test.charAt(i);
			
		}
		
		if(name2.equals(name)){
			
			System.out.println("Palindrome");
		}else{
			System.out.println("Not a palindrome");
		}
	}

	public static void main(String[] args) {
		new Palindrome2();

	}

}
