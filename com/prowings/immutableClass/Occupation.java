package com.prowings.immutableClass;

public class Occupation {
	
	float salary;
	String Designation;
	String city;
	
	public Occupation() {
		super();
	}

	public Occupation(float salary, String designation, String city) {
		super();
		this.salary = salary;
		Designation = designation;
		this.city = city;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Occupation [salary=" + salary + ", Designation=" + Designation + ", city=" + city + "]";
	}

	
	
	
	

}
