package com.exp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws CustException {
		
		int age = validateAge();
		System.out.println("Entered age: "+age);
		
	}
	
	private static int validateAge() throws CustException{
		Scanner sc=new Scanner(System.in);
		int age=0;
		try {
			age=sc.nextInt();
			
				if(age<=0) throw new CustException("Age must be greater than 0");
				else if(age>=100)throw new CustException("Age is not more than 100");
				
		} catch (InputMismatchException ex) {
			ex.getMessage();
		}
		
		
		return age;
	}
}
