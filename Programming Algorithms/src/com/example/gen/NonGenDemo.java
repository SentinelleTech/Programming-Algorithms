package com.example.gen;

public class NonGenDemo {
					NonGen ng;

	public NonGenDemo() {
		
				ng = new NonGen(800);
				
				int num = (int) ng.getob();
				System.out.println(num);
		
	
	}


	public static void main(String[] args) {
		new NonGenDemo();

	}

}
