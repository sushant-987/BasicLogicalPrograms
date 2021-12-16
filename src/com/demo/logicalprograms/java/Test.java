package com.demo.logicalprograms.java;


public class Test {

	public static void main(String[] args) {
	try {
		
		System.out.println("in try");
		
		int i=10;
		i-=10;
		if(i==0){
			
			return;
		}
		System.out.println(" "+50/i);
		
	}	catch(Exception e){
		System.out.println("in catch ["+e.getMessage() +"]");
	}
	finally{
		System.out.println("in finally");
	}
	System.out.println("just outside try ctch");

	}

}
