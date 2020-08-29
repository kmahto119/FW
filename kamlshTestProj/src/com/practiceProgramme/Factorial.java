package com.practiceProgramme;

public class Factorial {
	public static void main(String[] args) {
		//factorial(5);
		//factorialForLoop(5);
		
		primeNUmber(10);
		
		
	} 
	private static void primeNUmber(int num)
	{
		while(num>0){
		int flag=0;
		for(int i=2;i<=num-1;i++)
		{
			if(num%i==0)
			{
				flag++;
			}
		}
		if(num>2 && flag==0)
		{
			System.out.println("prime number"+num);
		}else {
			//System.out.println("not prime number");
		}
		num--;
		}
		
	}
	private static void factorial(int num)
	{
		int fact=1;
		while(num>0)
		{
			fact=fact*num;
			num--;
		}
		System.out.println(fact);
	}
	private static void factorialForLoop(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)	
		{
			fact=fact*i;
			
		}
		System.out.println(fact);
	}

}
