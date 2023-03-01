package com.prowings.string;

public class StringImmutableObject {
	
	public static void main(String[] args) {
		
		String s1 = "hello";
		String s2 = "he";
		String s3 = "hii";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s3));
		System.out.println(s1 == s3);
		
	}

}
