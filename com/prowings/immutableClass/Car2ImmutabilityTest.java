package com.prowings.immutableClass;

public class Car2ImmutabilityTest {
	
	public static void main(String[] args) {
		
		Engine engine = new Engine(2800,201,4);
		
		Car2 car = new Car2(2023,"TOYOTA FORTUNER",engine);
		
		System.out.println("Car2 object before change : " +  car);
		
		engine.setCapacity(2700);
		
		engine.setPower(204);
		
		System.out.println("Car2 object  After change : " +  car);
		
	}
}


