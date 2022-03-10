package com.example.threads;

public class MyThread {
	
			Thread th;
			
	public MyThread() {
		
				th = new Thread();
				
				th.start();
			
				System.out.println("hello World!");
		
	}
	
	public static void main(String[] args) {
		new MyThread();
	}
}