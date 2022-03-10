package com.example.collections_framework;

import java.util.Stack;
import java.util.Vector;

public class DemoVector {
	
	Vector<String> vec;
	Stack<String> s;

	public DemoVector() {
		
		vec = new Vector<String>();
		
		vec.add("Reggae");
		vec.add("Hiphop");
		vec.add("R&B");
		vec.add("Country");		
		vec.add("Blues");		
		vec.add("Gospel");
		vec.add("dancehall");
		vec.add("Rock");		
		vec.add("pop");	
		vec.add("hard Rock");		
		vec.add("soft rock");
		vec.add("rhumba");
		
		
		s = new Stack<String>();
		s.push("John");
		s.push("Patrick");
		s.push("Lynn");
		s.push("Ibrahim");
		s.push("Mark");
		
		vec.addAll(s);
		
		
		
		for(Object obj : vec){
			System.out.println(obj);
		}
		
	}

	
	public static void main(String[] args) {
		new DemoVector();

	}

}
