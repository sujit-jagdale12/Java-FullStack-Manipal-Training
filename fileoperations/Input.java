package com.fileoperations;

import java.util.Scanner;

import com.exp.NoMatchInput;
import com.typecheck.CheckerInput1;

public class Input {

	private final Scanner sc;

	public Input() {
		sc = new Scanner(System.in);
	}

	private int readInput() {
		int num = 0;
		try {
			num = sc.nextInt();
		} catch (Exception e) {
			sc.nextLine();
			throw new NoMatchInput("✖✖Enter number only✖✖");
		}
		return num;
	}

	public int getInput() {
		System.out.print("🔢Enter Number: ");
		int num = readInput();
		return num;
	}

	public int getChoice() {
		System.out.print("🔢Enter choice: ");
		return readInput();
	}

	public String getPath() {
		System.out.print("📂Enter Path: ");
		return sc.next();
	}

	public String getNewFileName() {
		System.out.print("📝Enter new File name: ");
		return sc.next();
	}
	public String getOldFileName() {
		System.out.print("📝Enter old File name: ");
		return sc.next();
	}
}
