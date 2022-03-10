package com.example.collection;

import java.util.Iterator;
import java.util.Stack;

public class DemoStack {
	
		Stack<String> s;

	public DemoStack() {
		
		s = new Stack<String>();
		
		//push() - adds elements onto a stack
		s.push("John");
		s.push("Joseph");
		s.push("Peter");
		s.push("Alvin");
		s.push("Rogers");
		s.push("Kelvin");
		
		//checks whether the stack is empty
		//System.out.println(s.empty());
		
		//peek() - looks at the topmost element
		//System.out.println(s.peek());
		
		//pop() - removes the topmost element
		//System.out.println(s.pop());
		
			Iterator<String> it = s.iterator();
			
			while(it.hasNext()){
				
				Object obj = it.next();
				System.out.println(obj);
				
			}
	}
	public static void main(String[] args) {
		new DemoStack();
	}
}