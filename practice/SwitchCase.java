package com.practice;

public class SwitchCase {

	public void advanceJava8SwitchCase(int key) {
		String day = switch (key) {
		case 1 -> "Mon";
		case 2 -> "Tue";
		case 3 -> "Wed";
		case 4 -> "Thu";
		case 5 -> "Fri";
		case 6 -> "Sat";
		case 7 -> "Sun";

		default -> "Enter correct value";
		};

		System.out.println("Today is " + day);
	}

	public void simpleSwitchCase(int key) {
		String day = "";

		switch (key) {
		case 1:
			day = "Mon";
			break;
		case 2:
			day = "Tue";
			break;
		case 3:
			day = "Wed";
			break;
		case 4:
			day = "Thu";
			break;
		case 5:
			day = "Fri";
			break;
		case 6:
			day = "Sat";
			break;
		case 7:
			day = "Sun";
			break;
		default:
			System.out.println("Error");
		}

		System.out.println("Today is " + day);
	}
	
	

	public static void main(String[] args) {

		SwitchCase switchCase = new SwitchCase();
		switchCase.advanceJava8SwitchCase(3);
	}
}
