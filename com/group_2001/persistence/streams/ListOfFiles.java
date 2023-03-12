package com.group_2001.persistence.streams;

import java.io.File;

public class ListOfFiles {
	
	File f;

	public ListOfFiles() {
		
		f = new File("E:/Programming Algorithms");
		
		File [] content = f.listFiles();
		
		for(File obj : content){
			
			System.out.println(obj.getName());
			
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new ListOfFiles();

	}

}
