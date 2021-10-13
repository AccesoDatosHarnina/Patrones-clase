package prueba;

import Factory.FactoryAbstractLocation;
import Factory.FactoryBike;
import Factory.FactoryCar;
import Product.Bike;
import Product.Car;

public class Cliente {

	public Car getCar(FactoryAbstractLocation factoryAbstract, FactoryCar factoryCar) {
		return factoryAbstract.createCar(factoryCar);
	};
	
	//Cada localizacion solo genera un tipo de bike
	public Bike getBike(FactoryBike factoryBike) {
		return factoryBike.getBike();
	}
}
