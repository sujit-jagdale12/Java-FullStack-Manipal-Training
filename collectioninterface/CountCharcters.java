package com.collectioninterface;

import java.util.HashMap;
import java.util.Map;

public class CountCharcters {

	public String countChars(String str) {

		String s = "";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				map.put(ch, map.get(ch) + 1);
			}
		}

		for (Character ch : map.keySet()) {
			s += ch + "" + (map.get(ch)) + ",";
		}
		return s.substring(0, s.length() - 1);
	}
}
