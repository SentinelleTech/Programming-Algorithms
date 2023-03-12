package com.example.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class DemoVector {
	
			Vector<String> v;
			List<String> l;

	public DemoVector() {
		
		l = new LinkedList<String>();
		
		l.add("Array");
		l.add("Array searching and sorting");
		l.add("Enumeration");
		l.add("Generics");
		l.add("Collection framework");
		l.add("Stack and Queue");
		
		
			v = new Vector<String>();
			v.add("John");
			v.add("Rogers");
			v.add("Alvin");
			v.add("Joseph");
			v.add("Peter");
			v.add("Kelvin");
			
			//v.clear();
			
			v.addAll(l);
			
			
			
			System.out.println(v);
			
			System.out.println(v.contains("Stack and Queue"));
			
			System.out.println(v.get(8));
		
	}

	
	public static void main(String[] args) {
		new DemoVector();
	}
}