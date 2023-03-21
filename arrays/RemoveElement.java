package com.arrays;

public class RemoveElement {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int ar[]=new int[arr.length-1];
		
		int ele=5;
		int j=0;
		for (int i = 0; i < arr.length; i++) {
			if(ele!=arr[i]) {
				ar[j++]=arr[i];
			}
		}
		int a=0;
		for (int i : ar) {
			arr[a++]=i;
		}
		
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
