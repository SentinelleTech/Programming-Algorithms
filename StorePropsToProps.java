package com.example.props;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class StorePropsToProps {
	
	Properties prop, prop2;
	FileOutputStream fos;
	FileInputStream in;

	public StorePropsToProps() {
		
		prop = new Properties();
		
		prop.setProperty("John", "john@gmail.com");
		prop.setProperty("Kym", "kym@gmail.com");
		prop.setProperty("Peter", "peter@gmail.com");
		prop.setProperty("Rogers", "rogers@gmail.com");
		prop.setProperty("Joseph", "joseph@gmail.com");
		
		
			try {
				
				fos = new FileOutputStream("properties ouput\\emails.properties");
		
				prop.store(fos, "First properties file created");
	
				fos.close();
				
				System.out.println("Imemaliza!");
	
				in = new FileInputStream("properties ouput\\emails.properties");
				
				prop2 = new Properties();
				prop2.load(in);
				
				for(String k : prop2.stringPropertyNames()){
					
					Object v = prop2.getProperty(k);
					
					System.out.println(k +" = "+ v);
					
				}
		
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}			
	}
	
	public static void main(String[] args) {
		new StorePropsToProps();
	}
}