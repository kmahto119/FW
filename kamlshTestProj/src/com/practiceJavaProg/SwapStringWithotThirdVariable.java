package com.practiceJavaProg;

public class SwapStringWithotThirdVariable {
	public static void main(String[] args)
	{
		String str="kamlesh";
		String str1="mahto";
		swapString(str,str1);
		System.out.println("before swap");
		System.out.println("str1="+str1);
		
		
	}
	public static void swapString(String str,String str1)
	{
		System.out.println("After swap");
		str=str+str1;
		str1=str.substring(0,str.length()-str1.length());
		System.out.println("str1="+str1);
		str= str.substring(str1.length(), str.length());
		System.out.println("str="+str);
		
	}

}
