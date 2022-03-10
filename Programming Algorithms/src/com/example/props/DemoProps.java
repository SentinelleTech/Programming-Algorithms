package com.example.props;

import java.util.Iterator;
import java.util.Properties;

public class DemoProps {
	
			Properties prop, prop2;
			Iterator<String> it;
			
	
	public DemoProps(){
		
			prop = new Properties();
			
			prop.setProperty("John", "john@gmail.com");
			prop.setProperty("Kym", "kym@gmail.com");
			prop.setProperty("Peter", "peter@gmail.com");
			prop.setProperty("Rogers", "rogers@gmail.com");
			prop.setProperty("Joseph", "joseph@gmail.com");
			
//			String e = prop.getProperty("John");
//			
//			System.out.println(e);
			
			
//			it = prop.keySet().iterator();
//			
//			while(it.hasNext()){
//				
//				String k = (String) it.next();
//				
//				Object val = prop.getProperty(k);
//				
//				System.out.println(val);
//				
//			}
			
			
			
	/*
	 * stringPropertyNames()
	 * Returns a set of keys in this property list where
     * the key and its corresponding value are strings,
     * including distinct keys in the default property list if a key
     * of the same name has not already been found from the main
     * properties list.
	*/
//			for(String k : prop.stringPropertyNames()){
//				
//				Object v = prop.getProperty(k);
//				
//				System.out.println(v);
//				
//			}
	}

	
	public static void main(String[] args) {
		new DemoProps();
	}
}