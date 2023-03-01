package com.prowings.string;

public class TestStudentMethod {
	
	public static void main(String[] args) {
		
		StudentMethod obj1 = new StudentMethod(101,"Ram");
		StudentMethod obj2 = new StudentMethod(101,"Ram");
		
		
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1 == obj2);
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
		
	}

}
