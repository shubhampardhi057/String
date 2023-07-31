package com.prowings.string;

import java.util.Arrays;

public class ToCharArrayMethod2 {
	
	public static void main(String[] args) {
		
	String line = "india is my country india have 27 states";
	
	String [] words = line.split(" ");
	
	System.out.println("Total number of words : "+words.length);
	
	String linewithoutspace = line.replace(" ","");
	
	System.out.println("Total number of chars : "+linewithoutspace.length());
	
	char [] characters = linewithoutspace.toCharArray();
	
	System.out.println(Arrays.toString(characters));
	
	
	
	}

}
