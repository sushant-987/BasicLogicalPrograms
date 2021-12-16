package com.demo.logicalprograms.java;


public class Application {
	
	public static void main(String[] args) {
		int a[]={5,2,9,3,4,6};
		int min=a[0];
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(min);
	}

}