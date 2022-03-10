package com.example.collections_framework;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class DemoList {
	
	 List<String> list, list2;
	 ListIterator<String> listIterator;

	public DemoList() {
		
		list = new LinkedList<String>();
		
		list.add("Reggae");
		list.add("Hiphop");
		list.add("R&B");
		list.add("Country");		
		list.add("Blues");		
		list.add("Gospel");
		list.add("dancehall");
		list.add("Rock");		
		list.add("pop");		
		
/////////// Patrick's solution ////////////////		
		list2 = new LinkedList<String>();
		
		list2.addAll(list.subList(4, 8));	
		
		
//////////////Common solution //////////////////		
		//list2 = list.subList(4, 8);
		
		listIterator = list2.listIterator();
		
		while(listIterator.hasNext()){
			
			Object obj = listIterator.next();
			
			System.out.println(obj);
			
		}		
		
//////////////// assign all the list elements to an Object array /////////////////		
//		Object [] genres = list.toArray();
//		
//		
//		for(Object obj : genres){
//			
//			System.out.println(obj);
//			
//		}
		
		
	}

	
	public static void main(String[] args) {
		new DemoList();

	}

}