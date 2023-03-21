package com.filehandling;

import java.io.File;

public class Q22_SizeOfFile {

	static int a=10;
	public void checkSize() {
		File file = new File("files/Codes/Addition.txt");

		long freeSpace = file.getFreeSpace() / (1024 * 1024);
		long totalSpace = file.getTotalSpace() / (1024 * 1024);
		long usedSpace = file.getUsableSpace() / (1024 * 1024);

		System.out.println("TotalSpace file Space: " + totalSpace + "MB");
		System.out.println("FreeSpace file Space: " + freeSpace + "MB");
		System.out.println("UsedSpace file Space: " + usedSpace + "MB");

	}
}
