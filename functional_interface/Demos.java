package com.functional_interface;

import java.util.function.Supplier;

public class Demos {

	public void supplier() {
		Supplier<Integer> s = () -> {
			return 10;
		};
		
		System.out.println(s.get());
	}
}
