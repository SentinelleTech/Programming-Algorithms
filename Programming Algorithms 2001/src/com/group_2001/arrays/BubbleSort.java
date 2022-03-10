package com.group_2001.arrays;

public class BubbleSort {
	
	int[] nums_to_sort = {50, 14, 33, 27, 99, 10, 35, 19, 42, 44};		
	int temp;
	
	boolean sorted = false;
	
	
	public BubbleSort() {
		
		while(sorted == false){
			
			sorted = true;
		
			for(int i = 0; i < nums_to_sort.length - 1; i++){
				
				if(nums_to_sort[i] > nums_to_sort[i+1]){
					
					temp = nums_to_sort[i];
					
					nums_to_sort[i] = nums_to_sort[i+1];
					
					nums_to_sort[i+1] = temp;
					
					sorted = false;
				}
				
			}//for loop ends here
		
		}//while loop ends here
		
		for(int n : nums_to_sort){
			System.out.print(n + "\t");
		}
		
	}//constructor ends here
	
	public static void main(String[] args) {
		new BubbleSort();
	}
}