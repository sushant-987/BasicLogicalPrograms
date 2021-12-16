package com.demo.logicalprograms.java;

public class MagingOfArray {

	public static void main(String[] args) {

		int a[]= {2,5,6,8,8};
		int b[]={9,8,5,7,3};
		
		int temp;
		
		int l1=a.length;
		int l2=b.length;
		int l=l1+l2;
		int c[]=new int[l1+l2];
		for(int i=0;i<l1;i++){
			
			c[i] = a[i];
			
		}
		
		
		for(int i=0;i<l2;i++){
			
			c[l1+i]=b[i];
			
		}
		
		for(int i=0;i<l1+l2;i++){
			
			for (int j=i+1;j<l;j++)
			{
				
				if(c[i]<c[j]){
					 temp=c[i];
					 c[i]=c[j];
					 c[j]=temp;
					
				}
			}
			System.out.print(c[i] +" ");
		}


	}

}