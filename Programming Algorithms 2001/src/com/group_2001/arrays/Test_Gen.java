package com.group_2001.arrays;

public class Test_Gen {
	
	Gen<String, Integer> g;
	

	public Test_Gen() {
		
//		g = new Gen<String, Integer>("John", 10);
//		
//		g.showType();
//		
//		System.out.println(g.getObject());
//		System.out.println(g.getOb());
//		
		
		
	}
	
	<T>String printName(){
		System.out.println("My name is John");
		
		return "";
	}
	
	

	
	public static void main(String[] args) {
		Test_Gen tg = new Test_Gen();
		
		tg.printName();
	}
}