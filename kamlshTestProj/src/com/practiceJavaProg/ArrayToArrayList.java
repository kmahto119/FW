package com.practiceJavaProg;

import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
	public static void main(String[] args) {
		//String array
		String[] words = {"ace", "boom", "crew", "dog", "eon"};
		//Use Arrays utility class
		List<String> asList = Arrays.asList(words);
		System.out.println(asList);
		//if(asList.equals("acr"))
			if(asList.contains("ace"))
		{
			System.out.println("found");
		}else{
			System.out.println("not found");
		}
	}

}
