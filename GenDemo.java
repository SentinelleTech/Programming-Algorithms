package com.example.gen;

public class GenDemo {
	
				Gen<String> g;
				Gen<Integer> g2;

	public GenDemo() {
		
				g = new Gen<String>("John");				
				String str = g.getob();				
				System.out.println(str);
				g.showType();
				
				g2 = new Gen<Integer>(1001);				
				int num = g2.getob();				
				System.out.println(num);
				g2.showType();
				
	}
	
	public static void main(String[] args) {
		new GenDemo();

	}

}
