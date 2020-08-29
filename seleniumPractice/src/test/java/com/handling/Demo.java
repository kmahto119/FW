package com.handling;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Demo {
	  public static void main(String[] args) 
	   {
		  List<String> lst = new ArrayList<String>();
		  lst.add("stack");
		  lst.add("stack");
		  lst.add("yahoo");
		  lst.add("google");
		  lst.add("msn");
		  lst.add("MSN");
		  lst.add("stack");
		  lst.add("user");
		  

		  Map<String, Integer> hm = new HashMap<String, Integer>();

		  for (String str : lst) {
			  
				
			  Integer j = hm.get(str);
			  hm.put(str, (j==null)?1:j+1);
			  /*
		      if (hm.containsKey(str)) 
		      {
		          hm.put(str, hm.get(str) + 1);
		      } else {
		          hm.put(str, 1);
		      }
		      
		  }
*/
		  for (Map.Entry<String, Integer> entry : hm.entrySet()) {
		      System.out.println(entry.getKey() + " = " + entry.getValue());
		  }
	
	   }

	   }
}
