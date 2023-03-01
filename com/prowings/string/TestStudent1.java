package com.prowings.string;

public class TestStudent1 {

	public static void main(String[] args) {
		Student2 obj= new Student2(1,9561192);
		Student2 obj1= new Student2(1,9561192);
		
		System.out.println(obj.equals(obj1));
		System.out.println(obj==obj1);
		
		
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
		
		System.out.println(obj.toString());
		System.out.println(obj1.toString());
		
		
	}
	
}
