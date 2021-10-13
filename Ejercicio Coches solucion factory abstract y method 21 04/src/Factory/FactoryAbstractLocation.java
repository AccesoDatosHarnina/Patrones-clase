package Factory;

import Product.Bike;
import Product.Car;
import Product.Location;

public abstract class FactoryAbstractLocation {
	public abstract Car createCar(FactoryCar factoryCar);
	public abstract Bike createBike(FactoryBike factoryBike);
}
