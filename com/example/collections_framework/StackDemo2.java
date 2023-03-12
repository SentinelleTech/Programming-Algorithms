package com.example.collections_framework;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo2 {
	
	Stack<String> s;
	Iterator<String> it;

	public StackDemo2() {
		
		StackDemo3 sd = new StackDemo3();
		
		sd.sum(10,  10);
		
		s = new Stack<String>();
		
		s.push("J2EE");
		s.push("JavaFX");
		s.push("Programming Algorithms");
		s.push("VB. Net");
		s.push("FA");
		
		
		it = s.iterator();
		
		while(it.hasNext()){
			
			String obj = it.next();
			
			System.out.println(obj);
			
		}
		
	}	
	public static void main(String[] args) {
		new StackDemo2();
	}
}//end


		class StackDemo3{
			
			public StackDemo3(){
				
			}
			
			public int sum(int a, int b){
				int total = a + b;
				
				System.out.println(total);
				
				return total;
			}
			
		}




