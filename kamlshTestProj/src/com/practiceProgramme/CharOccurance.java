package com.practiceProgramme;

import java.util.HashMap;

public class CharOccurance {
	public static void main(String[] args) {
		String str="kamleshwarmahto";
		charOccurance(str);
		charOccurancewithoutUsingLopp(str);
	}

	private static void charOccurance(String str) {
		
		HashMap<Character, Integer> hm=new HashMap<Character,Integer>();
		char[] charArray = str.toCharArray();
		for(char c:charArray)
		{
			Integer j = hm.get(c);
			hm.put(c, (j==null)?1:j+1);
		}
		System.out.println(hm);
	}
	private static void charOccurancewithoutUsingLopp(String str)
	{
		String replace = str.replaceAll("a", "");
		System.out.println("occurance of a:="+(str.length()-replace.length()));
		
	}
	

}
