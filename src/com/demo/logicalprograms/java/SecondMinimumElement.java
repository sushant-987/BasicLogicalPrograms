package com.demo.logicalprograms.java;

public class SecondMinimumElement {

	public static void main(String[] args) {

		int a[]={6,5,2,7,3};
		int temp;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			if(i==1){
				
				break;
			}
		}
		
		
		/*for(int i=0;i<a.length;i++){
			
			System.out.print(a[i] +"  ");
		}
		*/
System.out.println("Second largest element in an array is :"+a[1]);
	}

}