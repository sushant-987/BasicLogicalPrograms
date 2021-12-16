package com.demo.logicalprograms.java;

public class SmallestElement {

	public static void main(String[] args) {

		int a[]={5,3,8,6,1};
		int min=a[0];
		
		for(int i=1;i<a.length;i++){
			if(min>a[i]){
				
				min=a[i];
				
			}
			
		}

		System.out.println(min);
	}

}