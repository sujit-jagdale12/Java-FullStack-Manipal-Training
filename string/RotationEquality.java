package com.string;

import java.util.Arrays;

public class RotationEquality {

	public boolean isRotationEqual(String one,String two) {

		char[] first=one.toCharArray();
		char[] second=two.toCharArray();
		
		Arrays.sort(first);
		Arrays.sort(second);
		
		for (int i = 0; i < second.length; i++) {
			if(first[i]!=second[i]) {
				return false;
			}
		}
		return true;
	}
}
