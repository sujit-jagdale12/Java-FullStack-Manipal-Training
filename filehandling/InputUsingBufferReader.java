package com.filehandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputUsingBufferReader {

	public String input() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		return reader.readLine();
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputUsingBufferReader in = new InputUsingBufferReader();

		System.out.println("Enter number");
		
		int i = Integer.parseInt(in.input());

		System.out.println("Ans: " + i);
	}
}
