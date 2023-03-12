package com.example.streams;

import java.io.File;
import java.io.IOException;

public class TempFile {

	public TempFile() {
		
		try {
			
			File f = File.createTempFile("john2", ".tmp");
		
			System.out.println("success");
			
			System.out.println(f.getCanonicalPath());
		
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

	public static void main(String[] args) {
		new TempFile();
	}
}