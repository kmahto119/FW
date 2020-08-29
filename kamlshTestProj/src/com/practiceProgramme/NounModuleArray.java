package com.practiceProgramme;

public class NounModuleArray {
	
	public static void nameDisplay(int... a)
	{
		System.out.println("var-arg display....");
	}
	
	public static void diaplay(int[] a)
	{
			for(int elemet:a)
			{
				System.out.print(elemet+" ");
			}
			System.out.println();
	}
	public static void charDisplay(char[] c)
	{
		for(char chElement:c)
		{
			System.out.print(chElement+" ");
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr={10,20,50,60,80};
		char[] ch=new char[3];
		ch[0]='a';
		ch[1]='k';
		ch[2]='m';
		//ch[3]='l';
		
		diaplay(arr);
		charDisplay(ch);
		nameDisplay(10,20);
		nameDisplay(10);
		nameDisplay(arr);
	}

}
