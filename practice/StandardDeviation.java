package com.practice;

public class StandardDeviation {

	private double[] arr;
	private double mean;

	public StandardDeviation(double[] arr) {
		if (arr == null) {
			throw new RuntimeException("");
		}
		this.arr = arr;

		mean = getMean();
	}

	private double getMean() {
		return totalSum() / length();
	}

	private double length() {
		return arr.length;
	}

	private double totalSum() {
		double sm = 0;

		for (double el : arr) {
			sm += el;
		}

		return sm;
	}

	public double stdDv() {

		double sqr = 0;

		for (double el : arr) {
			sqr += Math.pow((el - mean), 2);
		}

		return Math.sqrt(sqr / length());
	}
}