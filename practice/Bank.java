package com.practice;

import java.util.Scanner;

public class Bank {

	public void bankOpearations() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Wel-come to Bank");

		boolean exit = true;

		while (exit) {
			System.out.println("Enter your choice\n1 for Balance \n2 for withdraw \n3 Deposit \n4 Transfer \n5 Exit");
			int choice = sc.nextInt();

			if (choice == 1)
				System.out.println("Balance");
			else if (choice == 2)
				System.out.println("Withdraw");
			else if (choice == 3)
				System.out.println("Deposit");
			else if (choice == 4)
				System.out.println("Transfer");
			else if (choice == 5) {
				System.out.println("Exit");
				break;
			} else {
				System.out.println("Invalid choice");
			}
			System.out.println("------------------");
		}
	}

	public static void main(String[] args) {

	}
}
