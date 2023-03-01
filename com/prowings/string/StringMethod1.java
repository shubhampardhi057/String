package com.prowings.string;

public class StringMethod1 {
	
	public static void main(String[] args) {
	
		
		String s1 = "hello java developer welcome to java world";
		
		String s2=s1.replace("java","python");
		
		
		System.out.println(s2);
		
		
		
		String s3 =s1.replaceFirst("java","python");
		
		System.out.println(s3);
		
		
		
		String [] words = s1.split(" ");
		
		for (String word:words) 
		{
	            System.out.println(word);
		}
		
		
		String message = String.join(" ","java","is","cool");
		
		System.out.println(message);
		
		
		String message1 = String.join("@","java","is","cool");
		
		System.out.println(message1);
		
		
		
		String str1 = "hello";
		String str2 = "HII";
		
		System.out.println(str1.toUpperCase());
		System.out.println(str2.toLowerCase());
		
		
		
		String s4 = "Hello ";
		String s5 = " HII";
		
		System.out.println(s4.trim());
		System.out.println(s5.trim());
		
	}

}
