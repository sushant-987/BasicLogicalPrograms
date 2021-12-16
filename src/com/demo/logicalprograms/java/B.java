package com.demo.logicalprograms.java;

class A {
	int i=20; 	
	public void m1(){
		System.out.println(i);
	}
	
//	private class D{}
}
public class B extends A{
	
	
	
	public static void main(String[] args) {
		B c1= (B) new B(); 
	//	B c1=new B();
	
		System.out.println(c1.i);
	}
}