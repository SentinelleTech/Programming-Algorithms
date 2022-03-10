package com.group_2001.runnable.thread;

public class ThreadOne {
	
	Thread th;

	public ThreadOne() {
		
		th = new Thread(new RunnableOne(2, 1000));
		
		th.start();
		
	}

	
	public static void main(String[] args) {
		new ThreadOne();
		System.out.println("Name from main method: " + Thread.currentThread().getName());  		

	}

}
