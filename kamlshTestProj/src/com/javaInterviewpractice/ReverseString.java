package com.javaInterviewpractice;

import java.util.HashMap;

public class ReverseString {
	
	public static void main(String[] args)
	{
		String str="sun raises from east";
		//reverseString(str);
		char ch='z';
		//(str,ch);
		
		//characterOccuranceInString(str);
		
		//startWithUpperCaseOrNot(str);
		
		reverseFirstAndLastWord(str);
		
		
	}
	/*
	 * Reverse first and last word
	 * 
	 * */
	private static void reverseFirstAndLastWord(String str) {
		String[] strArr = str.split(" ");
		String revStr="";
		for(int j=0;j<=strArr.length-1;j++)
		{
			if((j==0) && (j==strArr.length-1))
			{
				String strelementRev = strArr[j];
				StringBuffer sb=new StringBuffer(strelementRev);
				sb.reverse();
				String ss = sb.toString();
				revStr=revStr+ss;
			}else{
				revStr=revStr+strArr[j];
			}
			
		}
		System.out.println(revStr);
		
	}
	/*
	 * start with upper case or not
	 * 
	 * */
	private static void startWithUpperCaseOrNot(String str) {
		boolean flag=false;
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(0) >=65 && str.charAt(0) <= 91)
			{
				flag=true;
			}
		}
		if(flag)
		{
			System.out.println("Start with capital uppercase");
		}else {
			System.out.println("not start with uppercase");
		}
		
	}

	private static void characterOccuranceInString(String str) {
		
		HashMap<Character, Integer> hm=new HashMap<Character,Integer>();
		for(int i=0;i<=str.length()-1;i++)
		{
			char charAt = str.charAt(i);
			Integer j = hm.get(charAt);
			
			hm.put(charAt, (j==null)?1:j+1);	
		}
		System.out.println(hm);
	}

	/*
	 *find given character in string or not 
	 *
	 */
	private static void findGivenCharInStr(String str, char ch) {
		boolean flag=false;
		for(int i=0;i<=str.length()-1;i++)
		{
			char charAt = str.charAt(i);
			if(charAt==ch)
			{
				flag=true;
		
			}
		}
		if(flag==true)
		{
			System.out.println("character is present");
		}else {
			System.out.println("char is not present");
		}
		
	}


	/*
	 * Reverse string using loop
	 * 
	 */
	
	public static void reverseString(String str)
	{
		String revStr="";
		for(int i=str.length()-1;i>=0;i--)
		{
			char charAt = str.charAt(i);
			revStr=revStr+charAt;
			
		}
		
		System.out.println(revStr);
	}

}
