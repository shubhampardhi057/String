package com.prowings.immutableClass;

public final class Human {
	
	private final int weight;
	private final String name;
	private final Occupation occupation;
	
	public Human() {
		super();
		this.weight = 0;
		this.name = "";
		this.occupation = new Occupation();
	}
	
	public Human(int weight,String name,Occupation occupation) {
		
		super();
		
		this.weight = weight;
		this.name = name;
		
		Occupation clonedoccupation = new Occupation();
		
		clonedoccupation.salary=occupation.getSalary();
		clonedoccupation.Designation=occupation.getDesignation();
		clonedoccupation.city=occupation.getCity();
		
		this.occupation=clonedoccupation;
		
		
//		this.occupation = occupation;
	}

	public int getWeight() {
		return weight;
	}

//	public void setWeight(int weight) {
//		this.weight = weight;
//	}

	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}

	public Occupation getOccupation() {
		
		Occupation dummyoccupation = new Occupation();
		
		dummyoccupation.setSalary(this.occupation.getSalary());
		dummyoccupation.setDesignation(this.occupation.getDesignation());
		dummyoccupation.setCity(this.occupation.getCity());
		
		return occupation;
	}

//	public void setOccupation(Occupation occupation) {
//		this.occupation = occupation;
//	}

	@Override
	public String toString() {
		return "Human [weight=" + weight + ", name=" + name + ", occupation=" + occupation + "]";
	}
	
	

}
