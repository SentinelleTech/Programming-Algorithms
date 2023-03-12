package com.example.collections_framework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
	
	Queue<String> q, q2;
	Iterator<String> it;

	public QueueDemo() {
		
		
		q = new LinkedList<String>();
		q.add("Network Connectivity and administration");
		q.add("FA");
		q.add("Linux Server Admin");
		q.add("Windows Server Admin");
		q.add("Routing and Switching");
		q.add("Socket Programming");
		q.add("GSM");		
		q.offer("Mobile Phone repair");
		q.offer("Analogue electronics");
		
		System.out.println("The first queue\n");
		
		for(String str : q){
			
			System.out.println(str);
		}
		
		
		//System.out.println(q.peek());
//		System.out.println("Before deleting: " + q.element());
//		
//		String removed = q.poll();
//		
//		System.out.println("Element removed is: " + removed);
//		
//		System.out.println("After Deleting: " + q.element());

		System.out.println("\n\n\n\n");
		
		q2 = new PriorityQueue<String>();
		
		q2.add("Enterprise Development");
		q2.offer("Network Administration");
		
		it = q2.iterator();
		
		while(it.hasNext()){
			
			Object obj = it.next();
			
			System.out.println(obj);
			
		}
		
	}

	
	public static void main(String[] args) {
		new QueueDemo();

	}

}
