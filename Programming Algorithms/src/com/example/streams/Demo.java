package com.example.streams;

import java.io.File;
import java.nio.file.FileSystem;

import javax.imageio.ImageIO;

public class Demo {
	
	File f;
	File fileArray[];
	FileSystem fs;
	
	public Demo() {
		
		
//////////// List of all files in folder 1909 ///////////
		f = new File("C:/Users/kise/Desktop/1909");
		
		fileArray = f.listFiles();
		
				for(File f2 : fileArray){
					System.out.println(f2.getName());
				}			
		
		
		
///////////// listing available image extensions ////////////////
				String[] picExtensions = ImageIO.getWriterFormatNames();
				
				for(String majina : picExtensions){
					System.out.println(majina);
				}
		
			}
	
	public static void main(String[] args) {
		new Demo();		
	}
}