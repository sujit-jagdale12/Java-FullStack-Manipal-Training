package com.filehandling;

import java.io.File;
import java.io.IOException;

public class CheckFileOrDirectory {

	public void checkFile() {

//		File file = new File("FileOperations/xyz.txt");
		File file = new File("FileOperations");

		
		System.out.println(file.getAbsolutePath());
		if (file.isDirectory()) {
			System.out.println("This is Directory");
		}

		else {
			System.out.println("This is File");
		}
	}

	public static void main(String[] args) {
		CheckFileOrDirectory directory = new CheckFileOrDirectory();
		directory.checkFile();
	}
}
