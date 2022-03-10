package com.group_2001.arrays;

public enum MatatuSacco {
	
	TWONK(350), MANCHESTER(200), KENYAMPYA(50),
	KUKENA(400), NENO(450);
	
	int price;
	
	MatatuSacco(int p){
		price = p;
	}
	
	public int getTravellingFare(){
		return price;
	}

}






