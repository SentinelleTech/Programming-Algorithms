package com.group_2001.props;

import java.util.Iterator;
import java.util.Properties;

public class DemoProperties {
	
	Properties prop;
	
	Iterator<Object> it;

	public DemoProperties() {
		
		prop = new Properties();
		
		prop.setProperty("email", "john@doe.com");
		prop.setProperty("John", "1234");
		prop.setProperty("Ibrahim", "abcd");
		prop.setProperty("Patrick", "pat");
		prop.setProperty("Mark", "marko");
		
		
		
		
//		String mail = prop.getProperty("email");
//		
//		System.out.println(prop.getProperty("email"));
//		
//		String tumetoa = (String) prop.remove("email");
//		
//		System.out.println("Found? " + tumetoa);
//		
//		System.out.println(prop.getProperty("email"));
		
		
//		it = prop.keySet().iterator();
//		
//		while(it.hasNext()){
//			
//			String key = (String) it.next();
//			
//			String val = prop.getProperty(key);
//			
//			System.out.println(key + " = " + val);
//			
//		}
		
		for(String p : prop.stringPropertyNames()){
			
			String val = prop.getProperty(p);
			
			System.out.println(p + " = " + val);
			
		}
		
		
		
	}
	
	public static void main(String[] args) {
		new DemoProperties();

	}
}