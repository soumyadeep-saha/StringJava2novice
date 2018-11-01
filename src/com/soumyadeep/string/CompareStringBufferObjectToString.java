package com.soumyadeep.string;

public class CompareStringBufferObjectToString {

	public static void main(String[] args) {

		/*
		 * The below example shows how to compare StringBuffer object with String
		 * object. String object provides contentEquals() method to compare content with
		 * a StringBuffer object
		 */
        String c = "We are comparing the content with a StringBuffer content";
        StringBuffer sb =
            new StringBuffer("We are comparing the content with a StringBuffer content");
        /**
         * We can use contentEquals() method to compare content with a StringBuffer.
         * It returns boolean value.
         */
        boolean b=c.contentEquals(sb);
        System.out.println(b);
        if(c.contentEquals(sb)){
            System.out.println("The content is equal");
        } else {
            System.out.println("The content is not equal");
        }
        StringBuffer asb =
            new StringBuffer("You cannot compare the content with a String content");
        if(c.contentEquals(asb)){
            System.out.println("The content is equal");
        } else {
            System.out.println("The content is not equal");
        }
	}
}
