package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonFrom2Arrays {
// 1,2,3,4,5,1,2,3    arr1 --->1,2,3,4,5
	//2 3 4 53 6 7    arr2--->
	public List<Integer> getCommon(Integer[] array1, Integer[] array2) {
		List<Integer> common = new ArrayList<>();
		
		Set<Integer> set = new HashSet<>(Arrays.asList(array2));
		
		for (Integer i : array1) {
			if (set.contains(i)) {
				common.add(i);
			}
		}
//		common = Arrays.stream(array1)
//		        .filter(element -> Arrays.asList(array2).contains(element))
//		        .collect(Collectors.toList());

		return common;
	}

	public Set<Integer> getUnique(Integer[] array1, Integer[] array2) {
		Set<Integer> unique = new HashSet<>();

//		unique = Stream.concat(Arrays.stream(array1), Arrays.stream(array2))
//		        .distinct()
//		        .filter(element -> !Arrays.asList(array1).contains(element) || !Arrays.asList(array2).contains(element))
//		        .collect(Collectors.toList());

		for (Integer i : array1) {
			unique.add(i);
		}
		for (Integer i : array2) {
			unique.add(i);
		}
		return unique;
	}
}
