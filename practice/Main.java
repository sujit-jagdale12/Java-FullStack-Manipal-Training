package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class MaxAndMinNumber {
	public void repeatatingNumbers(int arr[]) {

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			int count = 0;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}

			if (!list.contains(arr[i])) {
				list.add(arr[i]);
				if (count == 0) {
					System.out.println(arr[i] + " is repeated " + count + " times");
				} else {
					System.out.println(arr[i] + " is repeated " + (count + 1) + " times");

				}
			}
		}

	}

	public void maxMinNum(int arr[]) {
		Arrays.sort(arr);

		System.out.println("Min Number is " + arr[0]);
		System.out.println("Max number is " + arr[arr.length - 1]);
	}

	public void smallestNumber(int arr[], int num) {

		Arrays.sort(arr);

		System.out.println(num + " smallest number is " + arr[num]);
	}
}

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MaxAndMinNumber maxAndMinNumber = new MaxAndMinNumber();

		int arr[] = { 1, 3, 2, 1, 3, 2, 8 ,1,3};
		maxAndMinNumber.repeatatingNumbers(arr);

//		int[] arr = { 1, 3, 1, 78, 67, 23, 56, 90, 2, 45 };
//		maxAndMinNumber.maxMinNum(arr);
//		System.out.println("Enter smallest number index to find");
//		int num = sc.nextInt();
//
//		maxAndMinNumber.smallestNumber(arr, num);
	}
}
