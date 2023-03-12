package com.example.collections_framework;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {
	
	Stack<String> s;
	Iterator<String> it;

	public StackDemo() {

		s = new Stack<String>();
		s.push("John");
		s.push("Patrick");
		s.push("Lynn");
		s.push("Ibrahim");
		s.push("Mark");
		
		it = s.iterator();
		
		while(it.hasNext()){
			
			Object value = it.next();
			
			System.out.println(value);
		}
		
	}

	
	public static void main(String[] args) {
		new StackDemo();

	}

}
