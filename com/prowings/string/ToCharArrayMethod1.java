package com.prowings.string;

import java.util.Arrays;

public class ToCharArrayMethod1 {
	
	public static void main(String[] args) {
		
		String line = "india is my country,india have 27 states";
		
		String linewithoutspace = line.replace(" ","");
		
		String [] words = line.split(" ");
		
		char [] characters = new char[linewithoutspace.length()];
		
		int i = 0;
		
		for(String word :words)
		{
			System.arraycopy(word.toCharArray(),0,characters,i,word.length());
			i += word.length();
		}
		
		System.out.println(Arrays.toString(characters));
		
		
		
	}

}
