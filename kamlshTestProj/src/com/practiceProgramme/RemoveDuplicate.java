package com.practiceProgramme;

public class RemoveDuplicate {
	/*In a String, remove duplicate words and duplicate characters.*/
	public static void main(String[] args)
	{
		String str="bangalore";
		removeDuplicate(str);
	}
	public static void removeDuplicate(String s)
	{
		 String str =""; 
	        for (int i = 0; i < s.length(); i++)  
	        { 
	            char c = s.charAt(i);  
	            if (str.indexOf(c) < 0) 
	            { 
	                str = str+c; 
	            } 
	        }
		System.out.println(str);
	}

}
