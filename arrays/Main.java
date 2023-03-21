package com.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void commonElements() {
		CommonFrom2Arrays arrays = new CommonFrom2Arrays();
		Integer arr1[] = { 1, 2, 3, 4, 5 };
		Integer arr2[] = { 4, 5, 6, 7, 8 };

		List<Integer> common = arrays.getCommon(arr1, arr2);
		Set<Integer> unique = arrays.getUnique(arr1, arr2);

		System.out.println("Common Elements: " + common);
		System.out.println("Unique Elements: " + unique);
	}

	public static void main(String[] args) {
//		commonElements();

		
	}
}
