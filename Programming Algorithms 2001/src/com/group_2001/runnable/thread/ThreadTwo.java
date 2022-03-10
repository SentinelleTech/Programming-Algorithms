package com.group_2001.runnable.thread;

public class ThreadTwo extends Thread {
	
	@Override
	public void run() {
		
		for(int i = 1; i < 10; i++){			
			
			System.out.println(i);
			
		}//end of for loop
		
		System.out.println("From run(): " + Thread.currentThread().getName());
		
	}
	
	public ThreadTwo(){
		start();
		setName("Kinyanjui");
	}

	
	public static void main(String[] args) {
		
		System.out.println("From main(): " + Thread.currentThread().getName());
		
		new ThreadTwo();

	}

}
