package com.demo.logicalprograms.java;

import java.util.HashSet;
import java.util.Set;

public class DuplicateByUsingCollection {

	public static void main(String[] args) {

		int[] a = { 2, 5, 3, 2, 1, 5, 6, 5 };

		Set<Integer> s1 = new HashSet<>();

		for (int b : a) {

			if (s1.add(b) == false) {
				System.out.println("duplicate element are :" + b);
			}

		}

	}

}