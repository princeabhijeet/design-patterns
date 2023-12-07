package com.prince.fdp.concreteproducts;

import com.prince.fdp.abstractproduct.Vehicle;

public class Car implements Vehicle {
	
	private String name;
	private String transmission;
	
	public Car(String name, String transmission) {
		this.name = name;
		this.transmission = transmission;
	}

	public String getName() {
		System.out.println("Name: "+this.name);
		return this.name;
	}

	public String getTransmission() {
		System.out.println("Transmission: "+this.transmission);
		return this.transmission;
	}

}
