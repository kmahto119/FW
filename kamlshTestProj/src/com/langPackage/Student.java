package com.langPackage;

public class Student {
	
	String name;
	int rollNo;
	public Student(String name, int rollNo)
	{
		this.name=name;
		this.rollNo=rollNo;
		
	}
	
	public String toString()
	{
		return "name="+name +" rollNo= "+rollNo;
		
	}

	public static void main(String[] args) {
		Student s1=new Student("kamlesh",101);
		Student s2=new Student("sanjay",105);
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
