package com.collectioninterface;

import java.util.HashMap;

public class App {

	public static void countChars() {
		CountCharcters cc = new CountCharcters();
		String op1 = cc.countChars("aaatttaeee");
		String sts1 = op1.equals("a4,t3,e3") ? "✅ Correct " : "❌ Wrong";
		System.out.println(sts1);

		String op2 = cc.countChars("qwqwwwqw");
		String sts2 = op2.equals("q3,w5") ? "✅ Correct " : "❌ Wrong";
		System.out.println(sts2);
	}

	public static void main(String[] args) {
		countChars();
	}
}
