package com.demo.logicalprograms.java;

public class ReverseString {

	public static void main(String[] args) {

		String st="Akshay Chidre";
		char ch[]=st.toCharArray();
		int l=ch.length;
		for(int i=l-1 ;i>=0;i--){
			System.out.print(st.charAt(i));
			
		}

	}

}