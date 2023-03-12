package com.example.gen;

public class MethDemo {

	public MethDemo() {
		
				printName(100.8);
		
	}
	
			public <T> T printName(T obj){
				System.out.println(obj);
				System.out.println("Type is: " + obj.getClass().getName());
			
				return obj;
			}

	
	public static void main(String[] args) {
		new MethDemo();
	}
}




