package com.example.threads;

public class MyThread3 {
	
	

	public MyThread3() {
		
		Thread thread = new Thread(){

			@SuppressWarnings("deprecation")
			@Override
			public void run() {
				
				for(int i = 0; i < 5; i++){
				
					try {
						Thread.sleep(1000);
					
						System.out.println("Hello from thread");
						
						if(i == 2){
							stop();
						}
				
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				}
			}
		
		};
		
		thread.start();
		
	}

	
	public static void main(String[] args) {
		new MyThread3();
	}
}