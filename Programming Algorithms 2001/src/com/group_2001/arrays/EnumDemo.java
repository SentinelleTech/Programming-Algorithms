package com.group_2001.arrays;

public class EnumDemo {
	
	Day d1, d2;

	public EnumDemo() {
		
		d1 = Day.FRIDAY;
		d2 = Day.FRIDAY;
				
		System.out.println(d1.equals(d2));
		
		//System.out.println(d);
		
//		switch(d){
//		
//		case MONDAY:
//			System.out.println("The week has begun");
//			break;
//		case TUESDAY:
//			System.out.println("Today is tuesday");
//			break;
//		case WEDNESDAY:
//			System.out.println("Today is wednesday");
//			break;
//		case THURSDAY:
//			System.out.println("Today is thursday");
//			break;
//		case FRIDAY:
//			System.out.println("Today is Friday");
//			break;
//		case SATURDAY:
//			System.out.println("Today is Saturday");
//			break;
//		case SUNDAY:
//			System.out.println("Go to church");
//			break;
//		default:
//			System.out.println("No such day exists");
//			
//		}
		
		
//		d = Day.valueOf("MONDAY");
//		
//		System.out.println("Day is: " + d);
//		
		
//		Day day[] = Day.values();
//		
//		for(Day d : day){
//			System.out.println(d);
//		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		new EnumDemo();
	}
}