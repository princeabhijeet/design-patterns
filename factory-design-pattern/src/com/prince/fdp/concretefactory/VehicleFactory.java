package com.prince.fdp.concretefactory;

import java.util.Objects;
import com.prince.fdp.abstractproduct.Vehicle;
import com.prince.fdp.concreteproducts.Bike;
import com.prince.fdp.concreteproducts.Car;
import com.prince.fdp.concreteproducts.NullVehicle;

public class VehicleFactory {
	
	static Vehicle vehicle = null;

	public static Vehicle createVehicle(String input, String name, String transmission) {
		if(Objects.equals(input, "Car")) {
			vehicle = new Car(name, transmission);
		}
		else if(Objects.equals(input, "Bike")) {
			vehicle = new Bike(name, transmission);
		}
		else {
			vehicle = new NullVehicle(name, transmission);
		}
		return vehicle;
	}
	
}
