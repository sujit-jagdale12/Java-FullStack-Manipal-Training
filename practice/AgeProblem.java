package com.practice;

import java.time.Year;
import java.util.Scanner;

public class AgeProblem {

	public static void ageValidator(int currentAge,int age) {
		
		if(age>currentAge) {
			System.out.println("Your age is from future");
		}else if(age-currentAge>23) {
			System.out.println("Age is more than 23");
		}
		else {
			System.out.println("Your age: "+(currentAge-age));
		}
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int ca=Year.now().getValue();
		System.out.println("Enter age: ");
		int age=sc.nextInt();
		
		ageValidator(ca, age);
	}
}
