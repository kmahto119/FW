package com.practiceJavaProg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListToSet {
	
	public static void main(String[] args)
	{
		List<String> lst=new ArrayList<String>();
		lst.add("kamlesh");
		lst.add("akash");
		lst.add("sasnjay");
		lst.add("gause");
		lst.add("surya");
		lst.add("biplav");
		lst.add("kamlesh");
		lst.add(null);
		lst.add(null);
		
		setConvert(lst);
		System.out.println(lst);
		
	}
	
	public static void setConvert(List<String> lst)
	{
		Set set=new HashSet(lst);
		System.out.println(set);
		
	}

}
