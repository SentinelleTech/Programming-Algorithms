package com.example.collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class DemoQueue {
	
		Queue<String> q, q2;

	public DemoQueue() {
		
		q = new LinkedList<String>();
				q.add("Java");
				q.add("Python");
				q.add("VB");
				q.add("PHP");
				q.add("Ruby");
				
				//check the size
				//System.out.println(q.size());
				
				//check whether it has items
				//System.out.println(q.isEmpty());
		
				//look for a specific item
				//System.out.println(q.contains("Java"));
				
				
				System.out.println(q);
//				q.removeAll(q);				
//				System.out.println(q);
				
//				q.retainAll(q);
//				System.out.println(q);
				
//				q.clear();
//				System.out.println(q);
				
//				q.poll();
//				System.out.println(q);
				
				System.out.println(q.peek());
		
		
		
		
		q2 = new PriorityQueue<String>();
		//System.out.println(q2.isEmpty());
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new DemoQueue();
	}
}