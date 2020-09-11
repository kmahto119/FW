package com.practiceJavaProg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortOrder {
	public static void main(String[] args) {
		String[] arr={"bharat","anshu","muzna","nihar","suraj","supriya","kamlesh","kapil"};
		      List<String> list = new ArrayList<String>(Arrays.asList(arr));
		      System.out.println(list);
		      
		      Collections.sort(list,new MyComparator());
		      System.out.println(list);
		      Collections.sort(list);
		      System.out.println(list);
		     
		      
	     }

}
 class  MyComparator implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) 
	{
		String s1=(String)obj1;
		String s2=(String)obj2;
		
		return s2.compareTo(s1);
	}
	 
	
}