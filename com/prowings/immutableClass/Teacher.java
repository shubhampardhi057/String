package com.prowings.immutableClass;

public class Teacher {
	
	int noOfTeacher;
	String name;
	String departmentname;
	
	public Teacher() {
		super();
	}

	public Teacher(int noOfTeacher, String name, String departmentname) {
		super();
		this.noOfTeacher = noOfTeacher;
		this.name = name;
		this.departmentname = departmentname;
	}

	public int getNoOfTeacher() {
		return noOfTeacher;
	}

	public void setNoOfTeacher(int noOfTeacher) {
		this.noOfTeacher = noOfTeacher;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartmentname() {
		return departmentname;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}

	@Override
	public String toString() {
		return "Teacher [noOfTeacher=" + noOfTeacher + ", name=" + name + ", departmentname=" + departmentname + "]";
	}
	
	
	
	

}
