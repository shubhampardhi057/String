package com.prowings.string;

public class InternMethod1 {
	
	public static void main(String[] args) {
		
		
		String s4 = "hii";
		String s5 = new String("hii");
		
		System.out.println(s4 == s5);
		
		s5=s5.intern();
		
		System.out.println(s4 == s5);
		
		
		
	}

}
