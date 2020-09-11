package com.practiceJavaProg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class OccuranceEachCharCollection {
	public static void main(String[] args) {
		String s="chandu ke chacha ne chatni chatai";
		char c='c';
		//charOccurance(s,c);
		charOcuranceUsingColle(s);
	}

	private static void charOcuranceUsingColle(String s) {
	char[] charArray = s.toCharArray();
	System.out.println(charArray);
	ArrayList<Character> arrayList = new ArrayList<Character>();
	for(int i=0;i<=charArray.length-1;i++)
	{
		arrayList.add(charArray[i]);
		
	}
	
	
	System.out.println(arrayList);
	
System.out.println(arrayList.size());
   int countOccurance=0;
   Character cc='c';
    for(int j=0;j< arrayList.size();j++)
    {
    	
    }
    
    System.out.println(cc +"==occurance===>"+countOccurance);
	
	
	
	
	
		
	}

	private static Object get(int j) {
		// TODO Auto-generated method stub
		return null;
	}

	private static void charOccurance(String s, char c) {
		int count=0;
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)=='c')
			{
				count++;
			}
		}
		System.out.println("occurance of "+c+" ====>" +count);
	}

}
