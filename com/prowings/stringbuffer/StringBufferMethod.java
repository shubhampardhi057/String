package com.prowings.stringbuffer;

public class StringBufferMethod {
	
	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer("hello");
		
		
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());
		
		
//		System.out.println(sb1.capacity());
		
		StringBuffer sb2 = sb1.append("world");
		
		
		System.out.println(sb2);
		
		System.out.println(sb2.capacity());
		System.out.println(sb2.length());
		
		
		StringBuffer s1 = new StringBuffer("shubham");
		
		System.out.println(s1.reverse());
		
		
		
	}

}
