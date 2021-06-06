package com.training.io.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class FileExample {

	public static void main(String[] args) {
		try {

			byte bwrite[] = { 'A', 66, 67, 40, 50 };
			FileOutputStream os = new FileOutputStream("/home/moglix/Desktop/one.txt");
			for (int i = 0; i < bwrite.length; i++) {
				os.write(bwrite[i]);
			}
			os.close();

			InputStream in = new FileInputStream("/home/moglix/Desktop/one.txt");
			int size = in.available();
			System.out.println("Size " + size);
			for (int i = 0; i < size; i++) {
				System.out.println(in.read());
			}
			in.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
			

	}
}