package com.practice;

import com.typecheck.CheckerInput1;

public class CheckerInput {

	private final CheckerInput1 input;

	public CheckerInput() {
		input = new CheckerInput1();
	}

	public void demo() {
		int num = 0;
		while (true) {
			input.choices();
			
			int i=0;
			try {
				i = input.getChoice();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			if (i == 1) {
				try {
					num = input.getInput();
					System.out.println("Num: " + num);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			} else if (i == 2) {
				break;
			}
		}
	}

	public static void main(String[] args) {

		CheckerInput c = new CheckerInput();
		c.demo();
		System.out.println("End of program");
	}
}
