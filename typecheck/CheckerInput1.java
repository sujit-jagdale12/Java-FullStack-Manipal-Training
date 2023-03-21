package com.typecheck;

import java.util.Scanner;

import com.exp.NoMatchInput;


public class CheckerInput1 {
	private final Scanner sc;

	public CheckerInput1() {
		sc = new Scanner(System.in);
	}

	private int readInput() {
		int num = 0;
		try {
			num = sc.nextInt();
		} catch (Exception e) {
			throw new NoMatchInput("number only");
		}
		return num;
	}

	public int getInput() {
		CheckerInput1 a = new CheckerInput1();
		System.out.println("Enter Number: ");
		int num = a.readInput();

		return num;
	}
	
	public int getChoice() {
		CheckerInput1 a = new CheckerInput1();
		System.out.println("enter choice");
		return a.readInput();
	}

	public void choices() {
		System.out.println("1 for done \n2 for go \n3 for stop");
	}
}
