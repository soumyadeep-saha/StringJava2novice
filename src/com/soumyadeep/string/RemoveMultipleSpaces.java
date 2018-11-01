package com.soumyadeep.string;

import java.util.StringTokenizer;

public class RemoveMultipleSpaces {

	public static void main(String[] args) {

		String str = "String    With Multiple      Spaces";
		StringTokenizer st = new StringTokenizer(str, " ");
		StringBuffer sb = new StringBuffer();
		while (st.hasMoreElements()) {
			sb.append(st.nextElement()).append(" ");
		}
		System.out.println(sb.toString().trim());
	}
}
