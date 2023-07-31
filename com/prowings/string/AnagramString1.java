package com.prowings.string;

import java.util.Arrays;

public class AnagramString1 {
	
	public static void main(String[] args) {
		
		String s1 ="Listen";
		String s2 ="silent";
		
        String res = isAnagram(s1, s2) ? "Given strings are Anagram" : "Not Anagram";
		
		System.out.println(res);
		
		
	}

	private static boolean isAnagram(String s1, String s2) {
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		if(s1 != null && s2 != null)
		{
			if(s1.length() == s2.length())
			{
				char[] s1chars = s1.toCharArray();
				char[] s2chars = s2.toCharArray();
				
				Arrays.sort(s1chars);
				Arrays.sort(s2chars);
				
				if(Arrays.equals(s1chars, s2chars))
					return true;
			}
		}
		else
		        return false;
		
		return false;
		
	}

}
