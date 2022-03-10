package com.example.threads;

import java.io.FileNotFoundException;

public class RunnableImplementation implements Runnable {

	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName() + ", executing the run() method!"); 

		try {
			
			throw new FileNotFoundException();
		
		
		} catch (FileNotFoundException e) {
			
			System.out.println("Exception must be caught here!");
			
			e.printStackTrace();
		}

	}

}





