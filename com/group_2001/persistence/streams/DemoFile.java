package com.group_2001.persistence.streams;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class DemoFile {
	
	File f;
	URI uri;

	public DemoFile() {
		
		try {
			
			uri = new URI("file:///C:/Users/kise/Desktop/Demo.txt");
			
			f = new File(uri);
			
			boolean created = f.createNewFile();
			
			if(created){
				System.out.println("File created");
			}else{
				System.out.println("File already exists");
			}
			
		
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		new DemoFile();

	}

}
