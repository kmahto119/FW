package com.billing;

public class Sample {
	int i=0;
	double j=10.2;
	public Sample() 
	{
		System.out.println("non-Argumented");
	}
	public Sample(int arg) 
	{
		this.i=arg;
		System.out.println("int-Argumented");
	}
	Sample(double arg) 
	{
		this.j=arg;
		System.out.println("double-Argumented");
	}
	
	

}
