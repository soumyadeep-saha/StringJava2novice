package com.soumyadeep.string;

public class MatchAFormat {

	public static void main(String[] args) {

		/*
		 * Below example shows how to match a string pattern with a regular expression.
		 * String.matches() method helps to match the string with a regex. Below example
		 * checkes weather given string starts with "www" or not
		 */
		String[] str = { "www.java2novice.com", "http://java2novice.com" };
		for (int i = 0; i < str.length; i++) {
			if (str[i].matches("^www\\.(.+)")) {
				System.out.println(str[i] + " Starts with 'www'");
			} else {
				System.out.println(str[i] + " is not starts with 'www'");
			}
		}
	}
}
