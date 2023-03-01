package com.prowings.string;

public class ToCharArrayMethod3 {
	
	public static void main(String[] args) {
		
		String line = "india is my country,india have 27 states";
		
		String [] words = line.split(" ");
		
		int wordcount =  0;
		
		for(int i=0;i<words.length;i++)
		{
			for(int j=0;j<words.length;j++)
			{
				if(words[i].equals(words[j]))
				{
					wordcount++;
				}
			}
			
			System.out.println("@  :--   " +words[i] +"  occurred :- " + wordcount + "times");
			wordcount=0;
		}
	}

}
