package com.example.gen;

public class TwoGenDemo {
	
				TwoGen<Integer, String> tg;

	public TwoGenDemo() {
		
				tg = new TwoGen<Integer, String>(100, "Winning number");							
		
				tg.showTypes();
				
				int num = tg.getob1();				
				System.out.println(num);
				
				String name = tg.getob2();
				System.out.println(name);
				
	}

	
	public static void main(String[] args) {
		new TwoGenDemo();

	}

}
