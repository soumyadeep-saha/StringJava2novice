package com.soumyadeep.string;

public class CompareTwoStringObjects {

	public static void main(String[] args) {

		/*
		 * The below example shows how to compare two string objects in java. You can
		 * not use "==" operator to compare two strings. String provides equals() method
		 * to compare two string objects. Also you can ignore case during string compare
		 * by calling equalsIgnoreCase() method. '==' operator compares the object
		 * reference but not the string value.
		 */
		String x = "JUNK";
		String y = "junk";
		/**
		 * We cannot use '==' operator to compare two strings. We have to use equals()
		 * method.
		 */
		if (x.equals(y)) {
			System.out.println("Both strings are equal.");
		} else {
			System.out.println("Both strings are not equal.");
		}
		/**
		 * We can ignore case with equalsIgnoreCase() method
		 */
		if (x.equalsIgnoreCase(y)) {
			System.out.println("Both strings are equal.");
		} else {
			System.out.println("Both strings are not equal.");
		}
	}
}
