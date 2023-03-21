package com.arrays;

public class FindPosition {

	public int isExists(int arr[], int num) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int arr[] = { 45, 22, 36, 14, 53, 96 };

		int element = 122;
		FindPosition position = new FindPosition();

		int index = position.isExists(arr, element);

		System.out.println(element + " is present at " + index + " index.");
	}
}
