package com.javaInterviewPract;

public class Test2 {
	
	int x=10;
	static int y=20;
	
	
	public static void main(String[] args) 
	{
		
		Test2 t1 = new Test2();
		t1.x=888;
		t1.y=999;
		System.out.println(t1.x+"===="+t1.y);//888=====>999
		
		Test2 t2 = new Test2();
		System.out.println(t2.x+"===="+t2.y);//10===999
		
	}

}