package com.java;

import java.nio.file.Files;
import java.nio.file.Path;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Path filePath = Files.writeString(Files.createTempFile("C:\\temp", "demo", ".txt"), "Sample text");
		String fileContent = Files.readString(filePath);	
		
		
		
		
	}

}
