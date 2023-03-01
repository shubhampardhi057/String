package com.prowings.string;

public class TestString1 {

	public static void main(String[] args) {
		
		String s1 = new String("Shubham Pardhi");
		
		String s2 = new String("Shubham Pardhi");
		System.out.println(s1 == s2);
		System.out.println(s2.equals(s1));
		
		
		String s3 = "Shubham Pardhi";
		System.out.println(s1 == s3);
		
		String s4 = "Shubham Pardhi";
		System.out.println(s3 == s4);
		
		String s5 = "Shubham Pardhi";
		System.out.println(s4 == s5);
		
		String s6 = "Shubham";
		
		String s7 = s6 + "Pardhi";
		System.out.println(s5 == s7);
		
		System.out.println(s5.equals(s7));
		
		final String s8 = "Shubham";
		
		String s9 = s8 + "Pardhi";
		System.out.println(s4 == s9);
		
	}

}