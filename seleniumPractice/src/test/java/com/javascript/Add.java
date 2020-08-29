package com.javascript;

import org.testng.annotations.Test;

public class Add {
	@Test(retryAnalyzer=RetryAnalyzer.class)
	public static void sum()
	{
	 System.out.println("add done");
	}

}
