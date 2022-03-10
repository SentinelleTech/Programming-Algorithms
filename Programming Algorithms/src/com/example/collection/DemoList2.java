package com.example.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoList2 {
	
			List<Integer> lt;

	public DemoList2() {
		
			lt = new ArrayList<Integer>();
			lt.add(10);
			lt.add(55);
			lt.add(12);
			lt.add(90);
			lt.add(100);
			lt.add(12);
			lt.add(90);
			lt.add(100);
			
			System.out.println(lt.isEmpty());
			
			Iterator<Integer> it = lt.iterator();
			
			while(it.hasNext()){
				
				System.out.println(it.next());
				
			}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new DemoList2();

	}

}
