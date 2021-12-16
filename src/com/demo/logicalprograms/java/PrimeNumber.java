package com.demo.logicalprograms.java;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		
		
		Scanner sc=new Scanner(System.in);
		
	/*	System.out.println("Enter A number plase :");
	int no=sc.nextInt();*/
		for(int no=1; no<=100;no++){
			int temp=0;
	for(int i=2;i<=no-1;i++){
		if(no%i==0){
			
			temp=temp+1;
			
		}
		
	}
	if(temp==0){
		System.out.println(no);
	}
	
		}
		sc.close();
	}

}