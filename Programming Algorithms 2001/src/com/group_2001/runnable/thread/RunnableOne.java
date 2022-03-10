package com.group_2001.runnable.thread;

public class RunnableOne implements Runnable{

	private int threadID;
	private int delay;
	
	public RunnableOne(int id, int d) {
		this.threadID = id;
		this.delay = d;
	}


	@Override
	public void run() {
		
		for(int x = 1; x <= 10; x++){
			
			try {
				
				Thread.sleep(delay);
				System.out.println("Thread: " + threadID + " is executing: " + x);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
			
		}
		
		System.out.println("Thread: " + threadID + " is Finished!");
				
	}
	
	
	public static void main(String[] args) {
		
		Thread th = new Thread(new RunnableOne(1, 2000));
		th.start();
	}

}
