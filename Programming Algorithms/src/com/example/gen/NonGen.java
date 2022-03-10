package com.example.gen;

			class NonGen {
			Object ob; 

				NonGen(Object o) {
				ob = o;
				}


				Object getob() {
				return ob;
				}
				
				void showType() {
				System.out.println("Type of ob is " + ob.getClass().getName());
				}
}
