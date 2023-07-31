package com.prowings.string;

public class InternMethod {
	
	public static void main(String[] args) {
		
		String s1 = "hello";
		
		String s2 = new String("hello");
		
		
		System.out.println(s1 == s2);
		
		
		 s2=s2.intern();
		
		System.out.println(s1 == s2);
		
		String s5= "helloworld";
		
		System.out.println(s5.substring(5));
		
		
		
	}
	
	


}
