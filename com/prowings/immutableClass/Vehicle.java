package com.prowings.immutableClass;

public final class Vehicle {
	
	private final int model;
	private final String name;
	
	
	public Vehicle() {
		
		super();
		this.model = 0;
		this.name = "";
	}
	
	public Vehicle(int model,String name) {
		
		super();
		this.model=model;
		this.name=name;
	}
	
	public int getModel() {
		return model;
	}
	
//	public void setModel(int model) {
//		this.model=model;
//	}
	
	public String getName() {
		return name;	
	}
	
//	public void setName(String name) {
//		this.name=name;
//	}

	@Override
	public String toString() {
		return "Vehicle [model=" + model + ", name=" + name + "]";
	}
	
	

}
