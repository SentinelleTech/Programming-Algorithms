package com.example.db_to_map;

public class Students {
	
			String adm;
			String firstName;
			String lastName;
			int age;
			String phone;

	public Students() {
		
	}
	
	public Students(String ad, String fn, String ln, int a, String p) {
				this.adm = ad;
				this.firstName = fn;
				this.lastName = ln;
				this.age = a;
				this.phone = p;
		}

			public String getAdm() {
				return this.adm;
			}
		
			public String getFirstName() {
				return this.firstName;
			}
		
			public String getLastName() {
				return this.lastName;
			}
		
			public int getAge() {
				return this.age;
			}
		
		
			public String getPhone() {
				return this.phone;
			}		

}