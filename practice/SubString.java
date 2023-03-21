package com.practice;

public class SubString {

	private String[] str;
	private String input;

	public SubString(String input) {
		this.input = input;
		str = new String[input.length() * (input.length() + 1) / 2];
	}

	public String getLongestSubString() {
		getUniqueSubstrings();
		int max = str[0].length();
		String longstr = str[0];

		for (String st : str) {
			if (st != null) {
				if (st.length() > max) {
					max = st.length();
					longstr = st;
				}
			}
		}
		return longstr;
	}

	public void getUniqueSubstrings() {
		int index = 0;

		for (int i = 0; i < input.length(); i++) {
			for (int j = i + 1; j <= input.length(); j++) {
				String substring = input.substring(i, j);

				if (isUnique(substring)) {
					str[index++] = substring;
				} else {
					break;
				}
			}
		}

	}

	private boolean isUnique(String st) {
		for (int i = 0; i < st.length(); i++) {
			for (int j = i + 1; j < st.length(); j++) {
				if (st.charAt(i) == st.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}

}
