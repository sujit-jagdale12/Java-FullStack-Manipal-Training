package com.practice;

public class SubStringMain {

	public static void checkString() {
//		SubString subString = new SubString("rar");
		SubString subString = new SubString("abcabccbb");
		
		System.out.println("Longest First Sub-String: " + subString.getLongestSubString());
	}

	public static void main(String[] args) {
		checkString();
	}
}
