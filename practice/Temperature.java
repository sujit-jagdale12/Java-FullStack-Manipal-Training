package com.practice;

public class Temperature {

	public double celToFah(double temp) {
		double Fahrenheit = (temp * 9 / 5) + 32;

		return Fahrenheit;
	}
	public void maxMin(int arr[]) {

		int max = arr[0], min = arr[0];

		for (int i = 0; i < arr.length; i++) {
		
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] > max) {
					max = arr[j];
				}
				if (arr[j] < min) {
					min = arr[j];
				}
			}
		}

		System.out.println("Max number is " + max);
		System.out.println("Min Number is " + min);
	}

	public static void main(String[] args) {

		Temperature temperature = new Temperature();
		double Fahrenheit = temperature.celToFah(36);
		
		System.out.println(Fahrenheit);
	}

}
