package com.prowings.stringbuffer;

public class StringBufferMethod1 {
	
	public static void main(String[] args) {
		
		StringBuffer s1 = new StringBuffer("shubham ");
		StringBuffer s2 = new StringBuffer(" pardhi");
		
		System.out.println(s1.append(s2));
		
		StringBuffer str = s1.reverse();
		
		System.out.println(str);
		
		StringBuffer str1 = str.reverse();
		
		System.out.println(str1);
		
		StringBuffer sb = new StringBuffer("Hello");
		
		sb.insert(1,"Java");
		
		System.out.println(sb);
		
		StringBuffer sb2 = new StringBuffer("Hello");
		
		sb2.replace(1,3,"Java");
		
		System.out.println(sb2);
		
		
		StringBuffer sb3 = new StringBuffer("Hello");
		
		sb3.delete(1,3);
		
		System.out.println(sb3);
		
		
		
		
		
		
		
		
	}

}
