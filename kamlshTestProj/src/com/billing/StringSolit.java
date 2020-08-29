package com.billing;



public class StringSolit {

	public static void main(String[] args) {
		String str1="kamlesh";
		String str2="mahto";
		
		str1=str1.concat(str2);
		str2=str1.substring(0, str1.length()-str2.length());
		System.out.println(str2);
		str1=str1.substring(str2.length(), str1.length());
		System.out.println(str1);
		
		
		 String str = "Java is java again java again";
	        int count = str.length() - str.replace("a", "").length();
	        System.out.println("Number of occurances of 'a' in "+str+" = "+count);
	}
}
