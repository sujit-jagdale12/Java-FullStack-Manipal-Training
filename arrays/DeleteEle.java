package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteEle {

	public static void deleteElement(int arr[], int num) {
		int[] arr_new = new int[arr.length - 1];
		for (int i = 0, k = 0; i < arr.length; i++) {
			if (arr[i] != num) {
				arr_new[k] = arr[i];
				k++;
			}
		}
		
		for (int i : arr_new) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[sc.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int ele = sc.nextInt();

		int i = Arrays.binarySearch(arr, ele);
		if (i >= 0) {
			deleteElement(arr, ele);
		} else {
			System.out.println("Element doesn't found in the Array!");
		}

	}
}
