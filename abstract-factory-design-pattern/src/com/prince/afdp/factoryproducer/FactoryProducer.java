package com.prince.afdp.factoryproducer;

import com.prince.afdp.abstractfactory.BrandFactory;
import com.prince.afdp.concretefactory.HondaFactory;
import com.prince.afdp.concretefactory.SuzukiFactory;

public class FactoryProducer {
	
	static BrandFactory brandFactory = null;
	
	public static BrandFactory getFactory(String brand) {
        if (brand.equals("Honda")) {
        	brandFactory =  new HondaFactory();
        } else if (brand.equals("Suzuki")) {
        	brandFactory =  new SuzukiFactory();
        }
        return brandFactory;
    }
}
