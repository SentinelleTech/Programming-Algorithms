package com.example.threads;

public class MyCounter {

	int count = 0;
	
	static int countTwo = 0;
	
	public synchronized void addition(int value){
		
		this.count += value;
		
	}
	
	public static synchronized  void subtraction(int val){
		
		countTwo -= val;
		
	}
	
	
	public void add(int value){
		
		synchronized(this){
			this.count += value;
		}
		
	}

	
	public static void main(String[] args) {
		
	}

}









