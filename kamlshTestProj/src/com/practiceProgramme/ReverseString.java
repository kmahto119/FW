package com.practiceProgramme;

import java.util.Arrays;
import java.util.HashMap;

/*
 *@kamlesh
 * 
 */

public class ReverseString {
	
	/*
	 * using chatAt String reverse
	 * 
	 */
	
	public static void revString(String s)
	{
		String rev="";
		for(int i=s.length()-1;i >= 0;i--)
		{
			char charAt = s.charAt(i);
			rev=rev+charAt;
		}
		System.out.println(rev);
	}
	/*
	 * using StringBuffer String reverse
	 * 
	 */
	
	public static void revStringSB(String s){
		
		StringBuffer sb = new StringBuffer(s);
		String strRevR = sb.reverse().toString();
		System.out.println(strRevR);
		
	}
	/*
	 * character present in string
	 * 
	 */
	public static void charPresent(String str,char ch){
	    boolean flag=false;
		char[] charArray = str.toCharArray();
		for(int i=0;i<=charArray.length-1;i++)
		{
			if(charArray[i]==ch)
			{
				flag=true;
				
			}
		}
		if (flag) {
			System.out.println("character present");
		} else {
			System.out.println("not present");

		}
		
	}
	
	
	/*
	 * character occurrence in string
	 * 
	 */
	public static void charOccurance(String str)
	{
		int j=1;
		HashMap<Character,Integer> hashMap = new HashMap<Character,Integer>();
		for(int i=0;i<=str.length()-1;i++)
		{
			//hashMap.put(str.charAt(i),hashMap.containsKey(str.charAt(i)==true ? j:j+1));
		}
		System.out.println(hashMap);
		
	}
	public static void main(String[] args) {
		String str="Bangalore";
		revString(str);
		/*==============================using StringBuffer=======================*/
		String str2="kolkata";
		revStringSB(str2);
		/*============================charater present in string=======================*/
		char ch1='z';
		charPresent(str2,ch1);
		/*============================charater occurance in string=======================*/
		charOccurance(str);
		
		/*============================Array to string convert=======================*/
		String[] strArray = {"abc","efg","fgh"};
		convertArrrayToString(strArray);
		/*============================	sorting of array=======================*/
		int[] intArr={60,20,40,31,88,90};
		arraySorting(intArr);
		
	}
	private static void arraySorting(int[] intArr) {
		Arrays.sort(intArr);
		for(int i=0;i<=intArr.length-1;i++)
		{
			System.out.println(intArr[i]);
		}
		
	}
	private static void convertArrrayToString(String[] strArray) {
		
		String str = strArray.toString();
		System.out.println(str);
		Object[] objArr = strArray.clone();
		String strP = Arrays.toString(objArr);
		System.out.println(strP);
	}

}
