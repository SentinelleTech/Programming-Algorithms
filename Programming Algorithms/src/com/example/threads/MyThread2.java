package com.example.threads;

public class MyThread2 extends Thread {
	
	int num1, num2, sum = 0;

	public MyThread2() {
		
		start();
		
	}
	
	@Override
	public void run() {
		System.out.println("Inside the thread");
		
		num1 = 10;
		num2 = 10;
		
		sum = num1 + num2;
		
		System.out.println("Sum is: " + sum);
		
		setName("Kinyanjui");
		
		System.out.println(getName());
		
	}

	public static void main(String[] args) {
		new MyThread2();
		
		System.out.println(Thread.currentThread().getName());

	}

}





