package com.prowings.string;

public class StringMethod {
	
	public static void main(String[] args) {
		
		String s ="Shubham";
		System.out.println(s.length());
		
		String s1 = "";
		System.out.println(s1.isEmpty());
		
		String s2 =" ";
		System.out.println(s2.isEmpty());
		System.out.println(s2.isBlank());
		
		String s3 = "Shubham";
		System.out.println(s3.charAt(0));
		
		String s4 ="Shubham";
		String s5 ="shubham";
		System.out.println(s4.equalsIgnoreCase(s5));
		
		String s6 = "ShubhamPardhi";
		String s7 = "Pardhi";
		System.out.println(s6.startsWith(s7,7));
		
		System.out.println(s6.endsWith(s7));
		
		String s8 = "1234Shubham1234";
		System.out.println(s8.indexOf('h'));		
		
		System.out.println(s8.lastIndexOf('h'));
		
		
		
		
	}

}
