package com.fileoperations;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class FileController {

	private Q24_FileOperations fo;

	public FileController() {
		fo = new Q24_FileOperations();
	}

	public void renameFile(String path, String newfile, String oldfile) {
		
		String output = fo.renameFileName(path, newfile, oldfile);
		System.out.println(output);

	}

	public void copyFile(String oldfile, String newpath) throws IOException {
		String copyFile = fo.copyFile(oldfile,newpath);
		System.out.println(copyFile);
	}
	
	public void getFiles(String source) {
		List<File> listFiles = fo.listFiles(source);
		for (File file : listFiles) {
			if(file.isDirectory()) {
				System.out.println("📂 "+file.getName());
			}else {
				System.out.println("📝"+file.getName());
			}
		}
	}
}
