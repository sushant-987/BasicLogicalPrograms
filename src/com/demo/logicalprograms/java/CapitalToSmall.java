package com.demo.logicalprograms.java;

public class CapitalToSmall {

	public static void main(String[] args) {

		String str="AkShAyChIdRe";
		
		char ch[] =str.toCharArray();
		
		for(int i=0;i<=ch.length-1;i++){
			
			if(ch[i]>64 && ch[i]<91){
				
				ch[i]=(char) (ch[i]+32);
			}
			else{

				ch[i]=(char) (ch[i]-32);
			}
			
		}
			
		System.out.println(ch);

	}

}