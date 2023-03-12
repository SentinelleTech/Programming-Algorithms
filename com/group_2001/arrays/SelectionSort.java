package com.group_2001.arrays;

public class SelectionSort {
	
	int[] nums = {14, 50, 33, 27, 99, 10, 35, 19, 42, 44};		
	

	public SelectionSort() {
		sortArray(nums);
		printArray(nums);
	}
	
	private static void printArray(int [] arr) {		
		
			for(int num : arr){
				System.out.print(num + " ");
			}
		System.out.println();
	}
	
	
	
	
	
	
	
	private static int[] sortArray(int[] arr) {		
		
		//At the first pass, i starts at index 0
		for(int i = 0; i < arr.length-1; i++) {

			//minIndex is 0, meaning this is where we will place our smallest value
			int minIndex = i;
			
			for(int j = i + 1; j < arr.length; j++) {
	
				
				/*
				 * {14, 33, 27, 10, 35, 19, 42, 44}
				 * Compare two elements: 14 and 33
				 * 33 is not less than 14 so minIndex is still 14 
				 * the inner loop runs again, but starts at index 2
				 * Compare two elements again: minIndex which is 14 and 27
				 * 27 is not less than 14 so minIndex remains the same
				 * Compare 14 and 10
				 * 10 is less than 14, so it has to be swapped
				 * 
				 * {10, 33, 27, 14, 35, 19, 42, 44}
				 * 
				 * 
				 * 
				 * 
				 */
				
				if(arr[j] < arr[minIndex]) {
					
					minIndex = j;
				
				}	
			
			}
			
			//swap
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
			
		}
		
		return arr;
	}

	
	public static void main(String[] args) {
		new SelectionSort();

	}

}
