package com.practiceJavaProg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringSortCoparator {
	public static void main(String[] args)
	{
		String[] str={"bharat","anshu","muzna","nihar","suraj","supriya","kamlesh","kapil"};
		List<String> lst=new ArrayList<String>(Arrays.asList(str));
		System.out.println(lst);
		Collections.sort(lst, new MyComparator1());
		System.out.println(lst);
		
		
		
	}

}
class MyComparator1 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=(String)o1;
		String s2=(String)o2;
		return s1.compareTo(s2);
	}
	
}

