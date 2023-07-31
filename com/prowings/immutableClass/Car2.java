package com.prowings.immutableClass;

public final class Car2 {
	
	private final int model;
	private final String companyName;
	private final Engine engine;
	
	
	public Car2() {
		super();
		this.model = 0;
		this.companyName = "";
		this.engine = new Engine();
	}


	public Car2(int model, String companyName, Engine engine) {
		super();
		this.model = model;
		this.companyName = companyName;
		
		Engine cloneEngine = new Engine();
		cloneEngine.capacity = engine.getCapacity();
		cloneEngine.numberOfCylinder = engine.getNumberOfCylinder();
		cloneEngine.power = engine.getPower();
		
//		this.engine = engine;
		
		this.engine = cloneEngine;
	
	}


	public int getModel() {
		return model;
	}


//	public void setModel(int model) {
//		this.model = model;
//	}


	public String getCompanyName() {
		return companyName;
	}


//	public void setCompanyName(String companyName) {
//		this.companyName = companyName;
//	}


	public Engine getEngine() {
		
		Engine dummyEngine = new Engine();
		dummyEngine.setCapacity(this.engine.getCapacity());
		dummyEngine.setNumberOfCylinder(this.engine.getNumberOfCylinder());
		dummyEngine.setPower(this.engine.getPower());
		
//		return engine;
		
		return dummyEngine;

	}


//	public void setEngine(Engine engine) {
//		this.engine = engine;
//	}


	@Override
	public String toString() {
		return "Car2 [model=" + model + ", companyName=" + companyName + ", engine=" + engine + "]";
	}
	
	
	

}
