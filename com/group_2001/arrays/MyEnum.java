package com.group_2001.arrays;

public class MyEnum {

	public MyEnum() {
		
		MatatuSacco ms[] = MatatuSacco.values();
		
		for(MatatuSacco sacco : ms){
			System.out.println(sacco + " Inalipisha: " + sacco.getTravellingFare());
		}
	}

	
	public static void main(String[] args) {
		new MyEnum();

	}

}



