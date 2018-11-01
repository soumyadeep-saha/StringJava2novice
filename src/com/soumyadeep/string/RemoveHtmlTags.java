package com.soumyadeep.string;

public class RemoveHtmlTags {

	public static void main(String[] args) {

        String text = "<B>I don't want this to be bold<\\B>";
        System.out.println(text);
        text = text.replaceAll("\\<.*?\\>", "");
        System.out.println(text);
	}
}
