package com.demo.logicalprograms.java;

public class DuplicateElementInArray {

	public static void main(String[] args) {

		int a[]={2,5,4,6,1,5,6};
		int temp;
		for(int i=0;i<a.length;i++){
			
			for(int j=i+1;j<a.length;j++){
				
				if(a[i]==a[j]){
					
					System.out.print(a[i] +" ");
					
				}
			}
			
			
			
		}

	}

}