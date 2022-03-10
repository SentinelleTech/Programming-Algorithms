package com.example.streams;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class FileDemo3 {
	
			URI uri;
			File f;
			String path = "file:///C:/Users/kise/Desktop/demo3.txt";

	public FileDemo3() {
		
		try {
			
			uri = new URI(path);
			f = new File(uri);
			
			boolean fileCreated = f.createNewFile();
		
			if(fileCreated){
				System.out.println("File created");
			}else{
				System.out.println("file not created");
			}
			
			
			System.out.println("Execute permission: " + f.canExecute());
		
			System.out.println("Read permission: " + f.canRead());
			
			System.out.println("Write permission: " + f.canWrite());
			
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}			
	}	
	
	public static void main(String[] args) {
		new FileDemo3();
	}
}