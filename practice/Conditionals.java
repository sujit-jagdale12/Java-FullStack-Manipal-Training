package com.practice;

public class Conditionals {

	public void ifElse(int num) {
		if(num>5) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}
	public static void main(String[] args) {
		
		Conditionals conditionals=new Conditionals();
		conditionals.ifElse(10);
	}
}
