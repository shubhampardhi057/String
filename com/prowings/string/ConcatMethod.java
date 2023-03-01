package com.prowings.string;

public class ConcatMethod {
	
	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "World";
		String s3 = "HelloWorld";
		String s4 = "";
		
		String s5 = s1.concat(s2);
		String s6 = s3.concat(s4);
		
		
		System.out.println(s5);
		System.out.println(s3 == s5);
		System.out.println(s6);
		System.out.println(s3 == s6);
		
		
		String s7 = s1+s2;
		String s8 = s3+s4;
		
		System.out.println(s7);
		System.out.println(s7 == s5);
		System.out.println(s8);
		System.out.println(s8 == s6);
		
		
		
	}

}
