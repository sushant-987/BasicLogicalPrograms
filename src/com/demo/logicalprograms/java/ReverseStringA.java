package com.demo.logicalprograms.java;

public class ReverseStringA {

	public static void main(String[] args) {

		String str = "Akshay";
		int l = str.length();
		String rev = "";
		for (int i = l - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);

		}

		System.out.println(rev);
	}
}