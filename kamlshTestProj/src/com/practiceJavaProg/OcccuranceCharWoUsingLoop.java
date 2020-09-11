package com.practiceJavaProg;

import java.util.HashMap;

public class OcccuranceCharWoUsingLoop {
	
	public static void main(String[] args)
	{
		String str="kamleshwarmahto";
		String ch="a";
		
		charOccurance(str,ch);
	}
	public static void charOccurance(String str,String ch)
	{
		String replaceAll = str.replaceAll(ch, "");
		int occurance =str.length()-replaceAll.length();
		System.out.println(str +" -->occurance of "+ch+"==>"+occurance);
		
	}

}
