package com.demo.logicalprograms.java;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StringRepeated {

	public static void main(String[] args) {

		String str="akshay chidre java akshay java";
		String st[]=str.split(" ");
		System.out.println(Arrays.toString(st));
		
		Map<String,Integer> mp=new HashMap<String, Integer>();
		
		
		for(int i=0;i<st.length;i++){
			
			if(mp.get(st[i]) !=null){
				
				mp.put(st[i],mp.get(st[i])+1);
			}
			
			else{
				
				mp.put(st[i], 1);
			}
			
		}
		
		Iterator<String> itr=mp.keySet().iterator();
		while(itr.hasNext()){
			
			
			String ch1=itr.next();
			
			if(mp.get(ch1)>1){
				
				System.out.println("Duplicate charatcter are :"+ch1 +"  count is  "+mp.get(ch1));
			}
		}
		
		

	}

}