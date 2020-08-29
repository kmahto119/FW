package com.javaInterviewPract;

import java.util.Arrays;
import java.util.List;

public class CharOccurance {
	public static void main(String[] args){
		int[] intArr={10,20,2,3,80,88};
		oddNumber(intArr);
		numberOccurance(intArr);
	}
	private static void numberOccurance(int[] intArr) {
		
		
	}
	
	
	private static void oddNumber(int[] arr)
	{
		int[] odd=new int[arr.length];
		int[] even=new int[arr.length];
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2==0)
			{
				even[i]=arr[i];
				//System.out.print(arr[i]+" ");
			}else {
				odd[i]=arr[i];
			}
		}
		for(int j=0;j<=odd.length-1;j++){
			System.out.print(odd[j] +" ");
		}
		System.out.println();
		for(int j=0;j<=even.length-1;j++){
			System.out.print(even[j] +" ");
		}
		
		
		
		
		/*List<int[]> oddList = Arrays.asList(odd);
		List<int[]> evenList = Arrays.asList(even);
		System.out.println(oddList);
		System.out.println(evenList);
	    */
	}

}
