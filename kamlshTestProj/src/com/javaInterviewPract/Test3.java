package com.javaInterviewPract;

public class Test3 {
	String str1="kamlesh";
	static String str2="mahto";
	
	public static void main(String[] args) 
	{
		Test3 t1 = new Test3();
		t1.str1="pappu";
		t1.str2="kumar";
		
		Test3 t2 = new Test3();
		System.out.println(t2.str1+"====="+t2.str2);
		System.out.println(t1.str1+"====="+t1.str2);
		
	}

}
