package com.example.threads;

public class ThreadExecute {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		MyRunnable1 mr1 = new MyRunnable1();
//		Thread thread1 = new Thread(mr1);
//		
//		MyRunnableTwo mr2 = new MyRunnableTwo();
//		Thread thread2 = new Thread(mr2);
//		
//		thread1.start();
//		thread2.start();
		
		System.out.println("The main thread is: " + Thread.currentThread().getName()); 

		
		Thread t = new Thread(new RunnableImplementation());
		t.start();
		
	}

}






