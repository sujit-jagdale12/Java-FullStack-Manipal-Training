package com.typecheck;

import java.util.Date;

public class CheckTypeMain {

	public static void main(String[] args) {

		TypeChecker checker = new TypeChecker();
		String obj = checker.checkObjectType(new Date());
		
//		String obj = checker.checkObjectType("Name");
//		String obj = checker.checkObjectType(new Car());

		if (obj == null) {
			System.out.println("We are working on this");
		} else {
			System.out.println("It is " + obj + " type Object.");
		}
	}
}
