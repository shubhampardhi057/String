package com.prowings.string;

public class ToCharArrayMethod {
	
	public static void main(String[] args) {
		
		String word = "Hello";
		
		char[] characters = word.toCharArray();
		
		for(char character:characters)
		{
			System.out.print(character);
			
		}
		
		
	}

}
