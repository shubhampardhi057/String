package com.prowings.string;

import java.util.Arrays;

public class StringWordCount {
	
	public static void main(String[] args) {
		
		String s = "india is my country india is beautiful";
		
		String [] words = s.split(" ");
		
		System.out.println(Arrays.toString(words));
		
		int wordcount =0;
		
		for(int i=0;i<words.length;i++)
		{
			for(int j=0;j<words.length;j++)
			{
				if(words[i].equals(words[j]))
				{
					if(i == 4)
					{
						continue;
					}
					wordcount++;
				}
			}
			
			System.out.println("@  :--   " +words[i] +"  occurred :- " + wordcount + "times");
			wordcount=0;
		}
		
	}
}
