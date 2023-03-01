package com.prowings.string;

public class TestPeople {
	
	public static void main(String[] args) {
		
		People obj  = new People(12345678,"Ram");
		People obj1 = new People(12345678,"Ram");
		
		System.out.println(obj.equals(obj1));
		System.out.println(obj == obj1);
		
		System.out.println(obj.toString());
		System.out.println(obj1.toString());
		
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
		
		
		
	}

}
