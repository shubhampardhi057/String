package com.prowings.string;

public class StudentMethod {
	
	int roll;
	String name;
	
	public StudentMethod() {
		super();
	}
	public StudentMethod(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	@Override
	public String toString() {
		return "StudentMethod [roll=" + roll + ", name=" + name + "]";
	}
	
	@Override
	public int hashCode() {
		
		int res = 1;
		res = roll*31 + name.hashCode()*31;
		return res;
		
	}
	@Override
	public boolean equals(Object obj) {
		
		StudentMethod obj1 = (StudentMethod)obj;
		
		boolean res = false;
		
		if(this.roll == obj1.roll) {
			
			if(this.name.equals(obj1.name));
			
			res = true;
		}
		else {
			res = false;
		}
		return res;
	}
}
	