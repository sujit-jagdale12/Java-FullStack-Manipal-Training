package com.practice;

public class SumOf2dArray {

	public void sumOfArray(int arr[][]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {

			int l = arr[i].length;
			for (int j = 0; j < l; j++) {
				sum += arr[i][j];
			}
		}

		System.out.println(sum);
	}

	public static void main(String[] args) {

		int arr[][] = { { 1, 4, 5, 6 }, { 1, 1 }, { 1, 1, 1 } };

		SumOf2dArray array = new SumOf2dArray();
		array.sumOfArray(arr);

	}
}
