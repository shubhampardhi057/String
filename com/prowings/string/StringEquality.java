package com.prowings.string;

public class StringEquality {

	public static void main(String[] args) {
		
		String s1 = new String("hello");
		
		String s2 = "hello";
		
		String s3 = "helloworld";
		
		String s4 = new String("hello");
		
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s2.equals(s4));
		
		
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
		
	}
}
