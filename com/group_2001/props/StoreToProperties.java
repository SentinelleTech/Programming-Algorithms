package com.group_2001.props;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class StoreToProperties {
	
	Properties prop;
	FileOutputStream fos;

	public StoreToProperties() {
		
		prop = new Properties();
		
		prop.setProperty("Email", "john@doe.com");
		prop.setProperty("First_Name", "John");
		prop.setProperty("Last_Name", "Doe");
		prop.setProperty("Address", "08, Stadium Road");
		
		try {
			
			fos = new FileOutputStream(new File("C:\\Users\\kise\\Desktop\\Bio Data.properties"));
		
			prop.store(fos, "First properties file created");
			
			fos.close();
			
			System.out.println("File created successfully");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	public static void main(String[] args) {
		new StoreToProperties();

	}

}
