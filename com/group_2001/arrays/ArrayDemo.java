package com.group_2001.arrays;

public class ArrayDemo {
	
	int nums[];

	public ArrayDemo() {
		
		nums = new int[5];
		nums[0] = 10;
		nums[1] = 15;
		nums[2] = 12;
//		nums[3] = 13;
//		nums[4] = 144;
		
		
		
		
		String[] names = new String[]{"John", "Patrick", "Ibrahim"};
		
		for(int i = 0; i < names.length; i++){
			System.out.println(names[i]);
			System.out.println(nums[i]);
		}
		
	}

	
	public static void main(String[] args) {
		new ArrayDemo();

	}

}
