package com.prowings.string;

public class Scenario {
	
	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "world";
		String s3 = new String("Helloworld");
		String s4 = "";
		
		String s5 = s1+s2;
		
		String s6 = s3.concat(s4);
//		String s6 = s3 + s4 ;
		
		System.out.println(s5);
		
		System.out.println(s3 == s5);
		
		System.out.println(s6);
		
		System.out.println(s3 == s6);
		
		
	}

}
