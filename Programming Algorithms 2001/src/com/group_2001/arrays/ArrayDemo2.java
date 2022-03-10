package com.group_2001.arrays;

public class ArrayDemo2 {

	public ArrayDemo2() {
		
		//int nums[][] = new int[3][2];
		
		int nums[][] = {
				{10, 20, 11},
				{15, 77},
				{100, 20, 12, 44, 778, 900},
				{10},
				{10, 20, 30, 40, 50}				
				
		};
		
		for(int r = 0; r < nums.length; r++){
			
			for(int c = 0; c < nums[r].length; c++){
				System.out.print(nums[r][c] + "\t");
			}
			System.out.println();
		}		
	}
	
	public static void main(String[] args) {
		new ArrayDemo2();
	}
}