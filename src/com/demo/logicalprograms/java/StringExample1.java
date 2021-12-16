package com.demo.logicalprograms.java;


public class StringExample1 {

	public static void main(String[] args) {

		String str="Welcome Java";
		str +="Please";
		str+="Go";
		
		char ch[] =str.toCharArray();
		for (int i=ch.length-1;i>=0;i--){
			
			System.out.print(ch[i]);
		}
				
		System.out.println(str);
	/*	String s2="Abc";
		s2=s2.concat("bc");
		s2=s2+"aks";
		System.out.println(s2);
		System.out.println(s2);*/
		
		System.out.println("Abs"+10+20);
		System.out.println(10+20+"akshay");
	}

}