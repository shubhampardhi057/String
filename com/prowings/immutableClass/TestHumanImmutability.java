package com.prowings.immutableClass;

public class TestHumanImmutability {
	
	public static void main(String[] args) {
		
		Occupation occupation = new Occupation(50000.0f,"Manager","Pune");
		
		Human hmn = new Human(60,"Ram",occupation);
		
		
		System.out.println("Human before change :"+hmn);
		
		
		occupation.setCity("Mumbai");
		occupation.setDesignation("Devloper");
		
		occupation.setSalary(100000.0f);
		
		System.out.println("Human after change :"+hmn);
		
		
		
	}

}
