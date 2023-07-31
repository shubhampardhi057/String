package com.prowings.immutableClass;

public final class School {
	
	private final int noOfStudent;
	private final String name;
	private final Teacher teacher;
	
	
	public School() {
		super();
		this.noOfStudent = 0;
		this.name = "";
		this.teacher = new Teacher();
	}


	public School(int noOfStudent, String name, Teacher teacher) {
		super();
		this.noOfStudent = noOfStudent;
		this.name = name;
		
	    Teacher cloneteacher = new Teacher();
	    
	    cloneteacher.noOfTeacher=teacher.getNoOfTeacher();
	    cloneteacher.name=teacher.getName();
	    cloneteacher.departmentname=teacher.getDepartmentname();
	    
	    this.teacher=cloneteacher;
		
		
//		this.teacher = teacher;
	}


	public int getNoOfStudent() {
		return noOfStudent;
	}


	public String getName() {
		return name;
	}


	public Teacher getTeacher() {
		
		Teacher dummyteacher = new Teacher();
		
        dummyteacher.setNoOfTeacher(this.teacher.getNoOfTeacher());
        dummyteacher.setName(this.teacher.getName());
        dummyteacher.setDepartmentname(this.teacher.getDepartmentname());
        
        return dummyteacher;
		
//		return teacher;
	}


	@Override
	public String toString() {
		return "School [noOfStudent=" + noOfStudent + ", name=" + name + ", teacher=" + teacher + "]";
	}


	
	
	

}
