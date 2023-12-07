package com.prince.fdp;

import com.prince.fdp.abstractproduct.Vehicle;
import com.prince.fdp.concretefactory.VehicleFactory;

public class VehicleClient {

	public static void main(String[] args) {
		Vehicle car = VehicleFactory.createVehicle("Car", "Honda City", "Automatic");
		car.getName();
		car.getTransmission();
		System.out.println();
		
		Vehicle bike = VehicleFactory.createVehicle("Bike", "Bajaj Pulsar", "Manual");
		bike.getName();
		bike.getTransmission();
		System.out.println();
		
		Vehicle auto = VehicleFactory.createVehicle("Auto", "Bajaj Auto", "Manual");
		auto.getName();
		auto.getTransmission();
		System.out.println();
	}

}
