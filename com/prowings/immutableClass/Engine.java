package com.prowings.immutableClass;

public class Engine {
	
	float capacity;
	int power;
	int numberOfCylinder;
	
	public Engine() {
		super();
	}

	public Engine(float capacity, int power, int numberOfCylinder) {
		super();
		this.capacity = capacity;
		this.power = power;
		this.numberOfCylinder = numberOfCylinder;
	}

	public float getCapacity() {
		return capacity;
	}

	public void setCapacity(float capacity) {
		this.capacity = capacity;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getNumberOfCylinder() {
		return numberOfCylinder;
	}

	public void setNumberOfCylinder(int numberOfCylinder) {
		this.numberOfCylinder = numberOfCylinder;
	}

	@Override
	public String toString() {
		return "Engine [capacity=" + capacity + ", power=" + power + ", numberOfCylinder=" + numberOfCylinder + "]";
	}
	
	
	

}
