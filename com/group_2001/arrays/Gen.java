package com.group_2001.arrays;

public class Gen<Type, Patrick> {
	
	Type t;
	Patrick pat;

	public Gen(Type obj, Patrick p) {
		t = obj;
		pat = p;
	}
	
	void showType() {
		
		System.out.println("Type is " + t.getClass().getName());		
		System.out.println("Type of Patrick is " + pat.getClass().getName());		
		
	}
	
	Type getObject(){
		return t;
	}
	
	Patrick getOb(){
		return pat;
	}
	

}
