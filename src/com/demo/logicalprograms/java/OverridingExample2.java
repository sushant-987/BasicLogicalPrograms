package com.demo.logicalprograms.java;

public class OverridingExample2 {
	int i;
	Object o=new Object();
	public Object m1(){
		System.out.println("inside parent");
		return o;
	}
	public Number m2(){
		System.out.println("inside parent");
		return i ;
	}
	

	public static void main(String[] args) {


	}

}