package com.prowings.stringbuffer;

public class StringReverse {

	public static void main(String[] args) {
		
		
		String s ="RADAR";
		
		StringBuffer sb1 = new StringBuffer(s);
		StringBuffer sb2 = sb1.reverse();
		
		System.out.println(sb2);
		
//		System.out.println(s.equals(sb2));
		
		
	}
}
