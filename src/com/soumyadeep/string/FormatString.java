package com.soumyadeep.string;

import java.util.Locale;

public class FormatString {

	public static void main(String[] args) {

		/*
		 * String.format() method helps us to format the given string. It replaces each
		 * format item in a specified string with the text equivalent of a corresponding
		 * object's value
		 */
        String str = "This is %s format example";
        System.out.println(String.format(str, "string"));
        String str1 = "We are displaying no %d";
        System.out.println(String.format(str1, 10));
        /**
         * String format by specifying Locale details
         */
        System.out.println("String format with Locale info:");
        System.out.println(String.format(Locale.US, str1, 10));
	}
}
