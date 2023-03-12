package com.example.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DemoList {
	
		List<String> l;

	public DemoList() {
		
		l = new LinkedList<String>();
		
		l.add("Array");
		l.add("Array searching and sorting");
		l.add("Enumeration");
		l.add("Generics");
		l.add("Collection framework");
		l.add("Stack and Queue");
		
		l.set(5, "Lists and Vectors");
		
		Iterator<String> it = l.iterator();
		
			while(it.hasNext()){
			
			System.out.println(it.next());
			
			}
		
	}
	public static void main(String[] args) {
		new DemoList();
	}
}