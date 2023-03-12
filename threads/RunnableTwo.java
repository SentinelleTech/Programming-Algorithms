package com.example.threads;

public class RunnableTwo {

	public RunnableTwo() {
		
				Runnable run = new Runnable(){

					@Override
					public void run() {
						
						System.out.println("Runnable from anonymous class");
						
					}
					
				};
				
				Thread th = new Thread(run);
				
				th.start();
	
	}

	
	public static void main(String[] args) {
		new RunnableTwo();
	}
}
