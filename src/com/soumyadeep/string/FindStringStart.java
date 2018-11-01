package com.soumyadeep.string;

public class FindStringStart {

	public static void main(String[] args) {

		/*
		 * Below example shows how to find whether a string value start with another
		 * string value. By using startsWith() method, you can get whether the string
		 * starts with the given string or not. Also this method tells that the string
		 * occurence at a specific position
		 */
		String str = "This is an example string.";
		System.out.println("Is this string starts with \"This\"? " + str.startsWith("This"));
		System.out.println("Is this string starts with \"is\"? " + str.startsWith("is"));
		System.out.println("Is this string starts with \"is\" after index 5? " + str.startsWith("is", 5));
	}
}
