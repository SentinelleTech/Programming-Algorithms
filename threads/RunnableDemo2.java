package com.example.threads;

public class RunnableDemo2 {
	
	public static void main(String[] args) {
		System.out.println("In main method!");
		
		Runnable run = new Runnable(){

			@Override
			public void run() {
				
				for(int i = 0; i < 5; i++){
					
					try {
						Thread.sleep(1000);
						
						System.out.println("Executing from inner class");
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}					
				}				
			}			
		};
		
		Thread thread = new Thread(run);
		thread.start();		

	}
}




