package com.group_2001.runnable.thread;

public class ThreadThree {
	
	public ThreadThree() {
		
		Thread th = new Thread(){
	
			@SuppressWarnings("deprecation")
			@Override
			public void run() {
				super.run();
				
				int x = 10;
				do{
					
					
					try {
						
						Thread.sleep(1000);
						
						System.out.println("Backwards " + x);
						
							if(x == 8){
								stop();
								
							}
						
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					x--;
					
				}while(x > 0);
				
			}		
			
			
		};
		
		th.start();
	
	}
	
	

	
	public static void main(String[] args) {
		new ThreadThree();

	}

}
