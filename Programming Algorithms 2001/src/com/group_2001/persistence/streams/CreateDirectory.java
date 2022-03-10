package com.group_2001.persistence.streams;

import java.io.File;

public class CreateDirectory {
	
	File f;

	public CreateDirectory() {
		
		f = new File("C:/john/kinyanjui/macharia/");
		
		boolean created = f.mkdirs();
		
		if(created){
			System.out.println("Folder created");
		}else{
			System.out.println("Folder already exists");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new CreateDirectory();

	}

}
