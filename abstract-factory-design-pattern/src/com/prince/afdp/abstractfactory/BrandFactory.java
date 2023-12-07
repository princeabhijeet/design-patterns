package com.prince.afdp.abstractfactory;

import com.prince.afdp.abstractproduct.Vehicle;

public interface BrandFactory {
	Vehicle createVehicle(String type, String name, String transmission);
}
