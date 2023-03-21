package com.practice;

public class SingleLoopPattern {

	public void pattern(int rows) {
		int count = 1;
		int maxCount = (rows * (rows + 1)) / 2;

		for (int i = 1; i <= maxCount; i++) {
			System.out.print("* ");
			if (i == (count * (count + 1)) / 2) {
				count++;
				System.out.println();
			}
		}
		
	}

	public static void main(String[] args) {
		
		SingleLoopPattern obj=new SingleLoopPattern();
		obj.pattern(5);

	}

}
