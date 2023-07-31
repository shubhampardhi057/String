package com.prowings.stringbuffer;

public class StringBufferScenario1 {
	
	public static void main(String[] args) {
		
		char[] data = {'h','e','l','l','o'};
		
		String s1 = new String(data); // Their is a string class constructor which accepts character array and creates string
		
		String s2 = "hello";
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1 == s2);
		
		
	}

}
