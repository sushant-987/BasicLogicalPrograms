package com.demo.logicalprograms.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class NewClass {

	public static void main(String[] args) {

		String str="AKshaysaha";
		
		char ch[]=str.toCharArray();
		Map<Character,Integer> mp=new HashMap<Character, Integer>();
		
		
			for(int i=0;i<ch.length;i++){
				
				if(mp.get(ch[i]) !=null){
					
					mp.put(ch[i],mp.get(ch[i])+1);
				}
				
				else{
					
					mp.put(ch[i], 1);
				}
				
			}
			
			Iterator<Character> itr=mp.keySet().iterator();
			while(itr.hasNext()){
				
				
				Character ch1=itr.next();
				
				if(mp.get(ch1)>1){
					
					System.out.println("Duplicate charatcter are :"+ch1 +"  count is  "+mp.get(ch1));
				}
			}
			
			
			
		

	}

}
