package Factory;

import Product.Bike;
import Product.Car;
import Product.CountryBike;
import Product.Location;
import Product.LuxuryCar;

public class FactoryUSA extends FactoryAbstractLocation {

	@Override
	public Car createCar(FactoryCar factoryCar) {
		return factoryCar.factoryMethod(Location.USA);
	}

	@Override
	public Bike createBike(FactoryBike factoryBike) {
		return factoryBike.getBike();
	}

}
