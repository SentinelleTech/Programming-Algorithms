package com.example.gen;

			public class Gen<T> {
				
				T obj1;
				
				public Gen(T obj2){
					obj1 = obj2;
				}
				
				//Return ob.
				T getob() {
				return obj1;
				}
				
				//Show type of T.
				void showType() {
				System.out.println("Type of T is " + obj1.getClass().getName());
				}
			
			}
			
			
			
			
			
			
			
			
			
			