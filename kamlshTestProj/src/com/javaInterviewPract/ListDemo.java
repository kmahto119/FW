package com.javaInterviewPract;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;



public class ListDemo {
	public static void main(String[] args)
	{
		ArrayList<String> bag = new ArrayList<String>();
		bag.add("pen");
		bag.add("copy");
		bag.add("pencil");
		bag.add("paper");
		bag.add("books");
		bag.add("ink");
		bag.add("tiffin");
		bag.add("ball");
		bag.add("ink");
		bag.add("ink");
		
		System.out.println("Before sorting:- "+bag);
		Collections.sort(bag);
		System.out.println("After sorting:-  "+bag);
		int binarySearch = Collections.binarySearch(bag, "books");
		System.out.println(binarySearch);
		
		
		ArrayList<String> box=new ArrayList<String>();
		System.out.println(box);
		box.addAll(bag);
		System.out.println(box);
		box.remove("ink");
		System.out.println(box);
		
		Object[] array = box.toArray();
		for (int i = 0; i < array.length; i++) 
		{
			Object object = array[i];
			System.out.print(array[i]+" ");
			
		}
		
	}

}