package com.practice;

public class SwapNumber {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("Before swapping: a = " + a + ", b = " + b);

		Swapping swapping = Swapping.swap(a, b);
		System.out.println("After swapping: a = " + swapping.getA() + ", b = " + swapping.getB());
	}

}

class Swapping {
	private int a;
	private int b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	Swapping(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public static Swapping swap(Integer a, Integer b) {
		Integer temp = a;
		a = b;
		b = temp;
		return new Swapping(a, b);
	}
}
