package com.fileoperations;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Q24_FileOperations {

	public String renameFileName(String path, String newfile, String oldfile) {
//		if (path.equals("null") || newfile.equals("null") || oldfile.equals("null")) {
//			throw new FileRelatedException("Path/file can't be null");
//		}

		File file = new File(path);
		File nfile = new File(path, newfile);
		File ofile = new File(path, oldfile);
		if (!file.isDirectory()) {
			throw new FileRelatedException("✖📂Passed path is not directory.");
		}
		if (ofile.exists()) {
			ofile.renameTo(nfile);
			return "✔📝File renamed succesfully.";
		}
		return "✖✖File doesn't present.";

	}

	public String copyFile(String source, String destination) throws IOException {

		File sfile = new File(source);
		File dfile = new File(destination);

		try (InputStream inputStream = new FileInputStream(sfile);
				OutputStream outputStream = new FileOutputStream(dfile);) {

			byte[] buffer = new byte[1024];
			int length;

			while ((length = inputStream.read(buffer)) > 0) {
				outputStream.write(buffer, 0, length);
			}

			return "✔✔Content copied successfully.";

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return "✖✖File doesn't copied.";
	}

	public List<File> listFiles(String source) {
		List<File> list = new ArrayList<>();
		File file = new File(source);
		if (!file.isDirectory()) {
			throw new FileRelatedException("✖📂Passed path is not directory.");
		}

		File[] listFiles = file.listFiles();

		for (File name : listFiles) {
			list.add(name);
		}
		return list;
	}

}
