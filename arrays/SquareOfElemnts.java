package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SquareOfElemnts {

	public static void main(String[] args) {
		Integer num[] = { 1, 2, 3, 4 };
		List<Integer> numbers = new ArrayList<>(Arrays.asList(num));

//		 Function<Integer, Integer> square = x -> x * x;
//		    numbers.stream().map(square).forEach(x -> System.out.println(x));

		// or
		List<Integer> squareNumbers = numbers.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println(squareNumbers);
	}
}
