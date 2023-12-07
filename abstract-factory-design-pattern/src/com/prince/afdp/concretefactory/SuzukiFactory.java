package com.prince.afdp.concretefactory;

import java.util.Objects;

import com.prince.afdp.abstractfactory.BrandFactory;
import com.prince.afdp.abstractproduct.Vehicle;
import com.prince.afdp.concreteproduct.Bike;
import com.prince.afdp.concreteproduct.Car;

public class SuzukiFactory implements BrandFactory {
	
	static Vehicle vehicle = null;
	
	@Override
	public Vehicle createVehicle(String type, String name, String transmission) {
		if(Objects.equals(type, "Car")) {
			vehicle = new Car(name, transmission);
		}
		else if(Objects.equals(type, "Bike")) {
			vehicle = new Bike(name, transmission);
		}
		return vehicle;
	}
	
}
