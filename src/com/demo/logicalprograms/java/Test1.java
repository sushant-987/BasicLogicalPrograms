package com.demo.logicalprograms.java;

public class Test1 {
	public static void main(String args[]) {
		// TODO Auto-generated method stub

		int a[] = { 5, 7, 2, 3, 8 };
		int b[] = { 4, 8, 6, 4, 6 };
		int l1 = a.length;
		int l2 = b.length;

		int c[] = new int[l1 + l2];

		for (int i = 0; i < l1; i++) {

			c[i] = a[i];
		}
		for (int i = 0; i < l2; i++) {

			c[a.length + i] = b[i];
		}

		for (int i = 0; i < l1 + l2; i++) {

			System.out.print(c[i]);
		}
	}

}