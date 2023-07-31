package com.prowings.immutableClass;

public class SchoolImmutabilityTest {
	
	public static void main(String[] args) {
		
		Teacher teacher = new Teacher(200,"Ram","Science");
		
		School school = new School(1000,"NHHSB", teacher);
		
		
		System.out.println(school);
		
		school.getTeacher().setName("sham");
		
//		teacher.setName("sham");
		
		teacher.setDepartmentname("Arts");
		
		
		System.out.println(school);
		
		
	}

}
