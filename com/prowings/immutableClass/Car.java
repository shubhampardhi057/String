package com.prowings.immutableClass;

public final class Car {
	
	private final int model;
	private final String companyName;
	private final long price;
	
	public Car() {
		super();
		this.model = 0;
		this.companyName = "";
		this.price = 0;
	}

	public Car(int model, String companyName, long price) {
		super();
		this.model = model;
		this.companyName = companyName;
		this.price = price;
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

	public long getPrice() {
		return price;
	}

//	public void setPrice(long price) {
//		this.price = price;
//	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", companyName=" + companyName + ", price=" + price + "]";
	}
	
	
	
	
	
	

}
