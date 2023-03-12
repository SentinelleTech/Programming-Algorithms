package com.example.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class DemoSet {
	
		Set<String> s;
		Vector<String> v;

	public DemoSet() {
		
			s = new HashSet<String>();
			s.add("John");
			s.add("Peter");
			s.add("Jane");
			s.add("Patrick");
			s.add("Jonah");
			
			
			v = new Vector<String>();
			v.add("Johns");
			v.add("Rogers");
			v.add("Alvin");
			v.add("Joseph");
			v.add("Peters");
			
			
			s.addAll(v);
			
//			System.out.println(s.size());
//			
//			System.out.println(s.contains("Johns"));
//			
			
			//s.remove("Jonah");
			
			for(String obj : s){
				System.out.println(obj);
			}
			
//			Iterator<String> it = s.iterator();
//			
//			while(it.hasNext()){
//				System.out.println(it.next());
//			}			
		
	}

	public static void main(String[] args) {
		new DemoSet();
	}
}