package com.prince.fdp.concreteproducts;

import com.prince.fdp.abstractproduct.Vehicle;

public class NullVehicle implements Vehicle {
	
	private String name;
	private String transmission;
	
	public NullVehicle(String name, String transmission) {
		this.name = "invalid vehicle name";
		this.transmission = "invalid vehicle transmission";
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
