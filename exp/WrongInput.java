package com.exp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WrongInput {

	public static int  isInt(Scanner sc,String str) {

		while (true) {
			try {
				System.out.println(str);
				int num = sc.nextInt();
				return num;
			} catch (InputMismatchException e) {
				System.out.println("Enter number only");
				sc.nextLine();
			}
		}
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = isInt(sc, "Enter your choice");
		
		System.out.println("Entered number: "+num);

	}
}
