package com.string;

public class RemoveCharacter {

	public String remChar(String str, String ch) {
		String replace = "";
		if (str.length() == 0) {
			return "Invalid String";
		} else if (ch.length() == 0) {
			return "Specify character to remove";
		} else if (!str.contains(ch)) {
			return "There is no " + ch + " in the given string";
		} else if (str.length() == 2) {
			return str.replaceFirst(ch, "");
		} else {
			replace = str.replace(ch, "");
		}

		if (replace.length() == 0) {
			return "nothing remains";
		}
		return replace;
	}
}
