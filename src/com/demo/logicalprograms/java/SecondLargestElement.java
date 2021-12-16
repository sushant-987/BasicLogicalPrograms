package com.demo.logicalprograms.java;

public class SecondLargestElement {

	public static void main(String[] args) {

		int a[] ={2,3,4,1,5};
		
		//System.out.println(a.length);
		int temp;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				
			if(a[i]<a[j]){
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
						
			}			
			
		}
		System.out.print(a[0]);

	}

}
