package com.practiceJavaProg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StringCount {
	public static void main(String[] args)
	{
		String str="nirma washing powder nirma powder is verry good for washing cloth nirma";
		wordOccurance(str);
		
	}
	public static void wordOccurance(String str)
	{
		String[] strArr = str.split(" ");
		HashMap<String,Integer> hashMap = new HashMap<String, Integer>();
		
		for(int i=0;i<strArr.length ;i++)
		{
			hashMap.put(strArr[i], (hashMap.get(strArr[i])==null)?1:hashMap.get(strArr[i])+1);
		}
		
		System.out.println(hashMap);
		
		System.out.println("only duplicate are:===");
		HashMap<String, Integer> hashMap2 = new HashMap<String,Integer>();
		for(int i=0;i<strArr.length ;i++)
		{
			if(hashMap.get(strArr[i])>1)
			{
				hashMap2.put(strArr[i], hashMap.get(strArr[i]));
			}
		}
		System.out.println(hashMap2);
		
		System.out.println("remove duplicate words");
		
		List<String> arrayList = new ArrayList<String>();
		for(int i=0;i<strArr.length ;i++)
		{
			if(hashMap.get(strArr[i])<2)
			{
				arrayList.add(strArr[i]);
				
			}
		}
		System.out.println(arrayList);
		
		
		
	}

}
