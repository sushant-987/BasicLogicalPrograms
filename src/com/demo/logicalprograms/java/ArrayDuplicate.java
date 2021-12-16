package com.demo.logicalprograms.java;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ArrayDuplicate {

	public static void main(String[] args) {

		int array[] = { 2, 6, 3, 2, 6, 2, 5, 3, 4, 1 };

		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();

		for (int i = 0; i < array.length; i++) {

			if (mp.get(array[i]) != null) {

				mp.put(array[i], mp.get(array[i]) + 1);
			}

			else {

				mp.put(array[i], 1);
			}
		}

		Iterator<Integer> itr = mp.keySet().iterator();
		while (itr.hasNext()) {

			Integer it = itr.next();

			if (mp.get(it) > 1) {

				System.out.println(
						"Dupliate Element in an array is :" + it + " Number of time repeated is :" + mp.get(it));
			}

			else {
				System.out.println("Non reapeted CHaracter are :" + it);

			}		}	}}


