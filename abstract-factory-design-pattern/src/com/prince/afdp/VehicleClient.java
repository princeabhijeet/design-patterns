package com.prince.afdp;

import com.prince.afdp.abstractfactory.BrandFactory;
import com.prince.afdp.abstractproduct.Vehicle;
import com.prince.afdp.factoryproducer.FactoryProducer;

public class VehicleClient {

	public static void main(String[] args) {
		BrandFactory hondaFactory = FactoryProducer.getFactory("Honda");
		Vehicle car = hondaFactory.createVehicle("Car", "Honda City", "Automatic");
		System.out.println("Car created: "+car.getName() + " - "+ car.getTransmission());
		
		System.out.println();
		
		BrandFactory suzukiFactory = FactoryProducer.getFactory("Suzuki");
		Vehicle bike = suzukiFactory.createVehicle("Bike", "Suzuki ZXR", "Manual");
		System.out.println("Bike created: "+bike.getName() + " - "+ bike.getTransmission());
	}

}
