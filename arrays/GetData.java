package com.arrays;

import java.util.Scanner;

public class GetData {

	public static String getData(String names[],int value) {
		String name=names[value];
		
		return name;
	}
	public static void main(String[] args) {
		String names[]= {"abc","xyz","pqr","sdf"};
		Scanner sc=new Scanner(System.in);	
		
		System.out.println("Enter position to get data");
		int pos=sc.nextInt();
		String data = getData(names, pos);
		
		if(data==null) {
			System.out.println("Data not available/found");
		}
		else {
			System.out.println(data+" name is found at "+pos+" index");
		}
	}
}
