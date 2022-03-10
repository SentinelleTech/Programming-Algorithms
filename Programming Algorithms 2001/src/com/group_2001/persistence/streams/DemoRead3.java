package com.group_2001.persistence.streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class DemoRead3 {
	
	Reader rd;
	InputStream is;

	public DemoRead3() {
		
		try {
			
			is = new FileInputStream("C:/Users/kise/Desktop/file.txt");
						
			rd = new InputStreamReader(is);
			
			int val = rd.read();
			
			while(val != -1){
				
				char c = (char) val;
				
				val = rd.read();
				
				System.out.print(c);
				
				
			}
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		new DemoRead3();

	}

}
