package com.example.threads;

public class Runnables {
	
			RunnableOne ro;
			
			Thread thread;

	public Runnables() {
		
				ro = new RunnableOne();
				
				thread = new Thread(ro);
				
				thread.start();
		
	}

	
	public static void main(String[] args) {
		new Runnables();

	}

}
