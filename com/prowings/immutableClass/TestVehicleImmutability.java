package com.prowings.immutableClass;

public class TestVehicleImmutability {
	
	public static void main(String[] args) {
		
		Vehicle vhl = new Vehicle(2021, "Fortuner");
		
		
		System.out.println("Vehicle before change :"+vhl);
		
//		System.out.println(vhl.getModel());
		
//		System.out.println(vhl.hashCode());
		
//		System.out.println(vhl.getClass());
		
		
		
		
		
		System.out.println("Vehicle after change :"+vhl);
	}

}
