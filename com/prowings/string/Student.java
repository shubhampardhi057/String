package com.prowings.string;

public class Student {
	
	public Student(int rollNo,String name) {
		super();
		
	}
	
	public static void main(String[] args) {
		
		
		Student s1 = new Student(101,"Ram");
		Student s2 = new Student(101,"Ram");
		
		System.out.println(s1.equals(s2));
		
	}


}
