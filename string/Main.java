package com.string;


public class Main {

	public static void rotationalString() {
		RotationEquality roEq = new RotationEquality();
		String sts1 = roEq.isRotationEqual("abc", "bbc") ? "bbc is rotation of abc" : "bbc is not a roatation of abc";
		System.out.println(sts1);

		String sts2 = roEq.isRotationEqual("aa", "aa") ? "aa is rotation of aa" : "aa is not a roatation of aa";
		System.out.println(sts2);

		String sts3 = roEq.isRotationEqual("a", "b") ? "b is rotation of a" : "b is not a roatation of a";
		System.out.println(sts3);

		String sts4 = roEq.isRotationEqual("a", "a") ? "a is rotation of a" : "a is not a roatation of a";
		System.out.println(sts4);

		String sts5 = roEq.isRotationEqual("abcpqr", "rqpcba") ? "rqpcba is rotation of abcpqr"
				: "rqpcba is not a roatation of abcpqr";
		System.out.println(sts5);
	}

	public static void removeChar() {
		RemoveCharacter rc = new RemoveCharacter();

		System.out.println("Answer (abcpqr)--------> " + rc.remChar("abcxpqr", "x"));
		System.out.println("There is no x in string--------> " + rc.remChar("abcpqr", "x"));
		System.out.println("Invalid String--------> " + rc.remChar("", "x"));
		System.out.println("Specify the character to be removed--------> " + rc.remChar("abcxpqr", ""));
		System.out.println("Answer (abcpqr)-------->" + rc.remChar("axbcxpqr", "x"));
		System.out.println("Answer (nothing remains)--------> " + rc.remChar("x", "x"));
		
		System.out.println("Answer (ab)--------> " + rc.remChar("axb", "x"));
		System.out.println("Answer (x)--------> " + rc.remChar("xx", "x"));

	}

	public static void main(String[] args) {
//		rotationalString();
		removeChar();
	}
}
