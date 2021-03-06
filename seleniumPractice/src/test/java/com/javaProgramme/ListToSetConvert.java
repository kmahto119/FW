package com.javaProgramme;	
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
			
public class ListToSetConvert {
			
	  public static void main(String[] args) 
	        { 
		    
	        // Creating a list of strings 
	        List<String> aList = Arrays.asList("Geeks", "for","GeeksQuiz", "GeeksforGeeks", "GFG"); 
	        
	        // Creating a hash set using constructor 
	        Set<String> hSet = new HashSet<String>(aList); 
	        
	        System.out.println("Created HashSet is=========="); 
	        for (String x : hSet) {
	        	System.out.print(x+","); 	
	        }
	            
	        System.out.println();
	        System.out.println("Created TreeSet is==========="); 
	        Set<String> tSet = new TreeSet<String>(aList); 
	        System.out.println("Created TreeSet is============"); 
	        for (String x : tSet)
	        {
	        	 System.out.print(x+","); 
	        }
	           
	    } 

}
