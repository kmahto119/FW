package com.langPackage;

public class Test {
	
	public String toString()
	{
		return "Test";
	}
	
	public static void main(String[] args) 
	{
		Integer i = new Integer(10);
		String str=new String("kamlesh");
		Test t=new Test();
		
		
		System.out.println(i);//10
		System.out.println(str);//kamlesh
		System.out.println(t);//Test==>if not overriddind toString it will provide FQC name
		
	}

}
