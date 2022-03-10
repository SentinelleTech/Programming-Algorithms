package com.group_2001.props;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;

public class LoadProperties {
	
	Properties p;
	FileInputStream fis;
	Iterator<Object> it;

	public LoadProperties() {
		
		p = new Properties();
		
		try {
		
			fis = new FileInputStream(new File("C:\\Users\\kise\\Desktop\\BioData.xml"));
			
			p.loadFromXML(fis);
			
			fis.close();
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		it = p.keySet().iterator();
//		
//		while(it.hasNext()){
//			
//			String key = (String) it.next();
//			
//			String val = p.getProperty(key);
//			
//			System.out.println(key + " = " + val);
//			
//		}
		
		for(String obj : p.stringPropertyNames()){
			
			String val = p.getProperty(obj);
			
			System.out.println(obj + " = " + val);
			
		}
		
		
	}

	
	public static void main(String[] args) {
		new LoadProperties();

	}

}
