package com.prowings.stringbuffer;

public class IntegerToString {
	
	public static void main(String[] args) {
		
		Integer i = 305;
		
		String s1 = String.valueOf(i);
		
		System.out.println(s1);
		
//		System.out.println(s1.equals(i));
		
		StringBuffer sb = new StringBuffer(s1);
		StringBuffer sb1 = sb.reverse();
		
		System.out.println(sb1);
		
		String s2 = new String(sb1);
		
		System.out.println(s2);
		
		int x = Integer.parseInt(s2);
		
		System.out.println(x);
		
//		System.out.println(s2.equals(x));
		
		
		
		
		
		
	}
	

}
