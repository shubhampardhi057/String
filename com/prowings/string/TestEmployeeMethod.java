package com.prowings.string;

public class TestEmployeeMethod {
	
	public static void main(String[] args) {
		
		
		EmployeeMethod obj1 = new EmployeeMethod(101,"Ram",15000l);
		EmployeeMethod obj2 = new EmployeeMethod(101,"Ram",15000l);
		
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1 == obj2);
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
		
		
	}

}
