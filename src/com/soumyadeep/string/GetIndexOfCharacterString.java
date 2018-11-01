package com.soumyadeep.string;

public class GetIndexOfCharacterString {

	public static void main(String[] args) {

		/*
		 * Below method shows how to get index of a specified character or string from
		 * the given string. By using indexOf() method you get get the position of the
		 * sepcified string or char from the given string. You can also get the index
		 * strting from a specified position of the string
		 */
        String str = "Use this string for testing this";
        System.out.println("Basic indexOf() example");
        System.out.println("Char 's' at first occurance: "+str.indexOf('s'));
        System.out.println("String \"this\" at first occurance: "+str.indexOf("this"));
        /**
         * Returns the first occurance from specified start index
         */
        System.out.println("First occurance of char 's' from 4th index onwards : "
                            +str.indexOf('s',4));
        System.out.println("First occurance of String \"this\" from 6th index onwards: "
                            +str.indexOf("this",6));
	}
}
