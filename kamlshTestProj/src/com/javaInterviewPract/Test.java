package com.javaInterviewPract;

public class Test {
	
	static int i=10;
	static int j;
	static String s;
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.i);//10
		System.out.println(i);//10
		//==================//
		Test t2 = new Test();
		System.out.println(j);//default value ===>0
		System.out.println(t2.j);//default value ====>0
		
		//================================//
		System.out.println(s);//default value ====>null
		
		//=================//
		
	}

}