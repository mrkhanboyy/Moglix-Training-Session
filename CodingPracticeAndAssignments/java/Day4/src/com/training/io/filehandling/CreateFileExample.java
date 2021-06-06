package com.training.io.filehandling;

import java.io.File;

public class CreateFileExample {

	public static void main(String[] args) {
		File file=new File("myfile.txt");
		try {
			boolean createNewFile=file.createNewFile();
			System.out.println("File created"+createNewFile);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		if(file.exists()) {
			System.out.println("file exists");
		}
	}
}
