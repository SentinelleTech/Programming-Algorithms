package com.example.threads;

public class RunnableDemo implements Runnable {
	
	public static void main(String[] args) {
		
		System.out.println("We are testing threads");
		
		System.out.println("Current thread is: " + Thread.currentThread().getName());

		RunnableDemo rd = new RunnableDemo();
		
		Thread t = new Thread(rd);
		
		t.start();
		
	}

	@Override
	public void run() {
		System.out.println("Inside run() method of runnable interface");
		
		Thread.currentThread().setName("Runnable Demo One");
		
		System.out.println("Current thread is: " + Thread.currentThread().getName());
	}

}
