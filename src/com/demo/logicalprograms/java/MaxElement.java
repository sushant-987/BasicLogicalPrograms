package com.demo.logicalprograms.java;

public class MaxElement {

	public static void main(String[] args) {

		int ar[] = { 3, 1, 7, 4, 5 };
		int max = ar[0];

		for (int i = 0; i < ar.length; i++) {

			if (max < ar[i]) {

				max = ar[i];
			}

		}

		System.out.println("maximum element is:" + max);
	}

}