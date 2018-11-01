package com.soumyadeep.string;

public class AppentConcatTwoStrings {

	public static void main(String[] args) {

		String b = "jump ";
        String c = "No jump";
        /**
         *  We can do string concatination by two ways. 
         *  One is by using '+' operator, shown below. 
         */
        String d = b+c;
        System.out.println(d);
        /**
         *  Another way is by using concat() method, 
         *  which appends the specified string at the end.
         */
        d = b.concat(c);
        System.out.println(d);
	}
}
