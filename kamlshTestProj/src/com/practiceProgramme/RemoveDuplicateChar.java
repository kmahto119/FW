package com.practiceProgramme;

public class RemoveDuplicateChar {
	public static void main(String[] args) {
		String str="bangalore";
		removeDup(str);
	}

	private static void removeDup(String str) {
		System.out.println(str);
		String s="";
		for(int i=0;i<=str.length()-1;i++)
		{
			// character at i'th index of s 
            char c = str.charAt(i); 
              
            // if c is present in str, it returns 
            // the index of c, else it returns -1 
			if(s.indexOf(c) < 0)
			{
				s=s+c;
			}	
		}
		System.out.println(s);
	}

}
