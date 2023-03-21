package com.practice;

public class PatternProgram {

	public void pyramidPattern(int rows) {
//		for (int i = 0; i < rows; i++) {
//			for (int j = i + 1; j > 0; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		for (int i = 1; i <= rows; i++) {
			int spaces = rows - i;
			int stars = 2 * i - 1;
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= stars; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		PatternProgram program = new PatternProgram();
		program.pyramidPattern(5);

	}
}
