package com.prowings.immutableClass;

public class EmployeeImmutabilityTest {
	
	public static void main(String[] args) {
		
		Department department = new Department(1200,"Production Department","CITI BANK");
		
		Employee emp = new Employee(1234,"RAM",department);
		
		
		System.out.println("befor change :--"+ emp);
		
		department.setNoOfEmployee(1500);
		
		department.setCompanyName("INFOSYS");
		
		department.setName("HR Department");
		
		System.out.println("after change :--"+emp);
	}

}
