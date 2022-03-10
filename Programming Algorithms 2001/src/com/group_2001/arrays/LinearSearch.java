package com.group_2001.arrays;

import java.util.Scanner;

public class LinearSearch {
	
	int[] nums = {14, 50, 33, 27, 99, 10, 35, 19, 42, 44};		
	int num_to_search;
	Scanner s;

	public LinearSearch() {
		
		s = new Scanner(System.in);
		System.out.println("Enter the number to search");
		
		num_to_search = s.nextInt();
		
		for(int i = 0; i < nums.length; i++){
			
			if(num_to_search == nums[i]){
				System.out.println("Found at index: " + i);
			}else{
				System.out.println("Not found!");
				
			}
			
			break;
		}
		
	}

	
	public static void main(String[] args) {
		new LinearSearch();
	}
}
