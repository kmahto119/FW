package com.javaInterviewPract;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class LiseDemo3 {
	public static void main(String[] args) {
		LinkedList bag = new LinkedList();
		bag.add("pen");
		bag.add("paper");
		bag.add("pencil");
		bag.add("books");
		bag.add("pen");
		bag.add("pen");
		System.out.println(bag);
		Set<String> set = new LinkedHashSet<String>(bag);
		System.out.println(set);
				
		
	}

}
