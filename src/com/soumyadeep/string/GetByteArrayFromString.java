package com.soumyadeep.string;

public class GetByteArrayFromString {

	public static void main(String[] args) {

        String str = "Soumyadeep Saha";
        byte[] b = str.getBytes();
        System.out.println("String length: "+str.length());
        System.out.println("Byte array length: "+b.length);
	}
}
