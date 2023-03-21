package com.practice;

class Occ {
	public void findOccurances(int[] arr) {
		int[] counts = new int[10]; 
		for (int num : arr) { 
			counts[num]++;
		}

		for (int i = 0; i < counts.length; i++) { 
			if (counts[i] > 0) { 
				System.out.println("" + i + " is repeated " + counts[i] + " times ");
			}
		}
	}
}

	public class NumbersOccurance {

		public static void main(String[] args) {

			Occ oc = new Occ();
			oc.findOccurances(new int[] { 1, 4, 6, 7, 1, 4, 6 });
		}
}
