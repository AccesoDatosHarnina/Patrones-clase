package Factory;

import Product.Bike;
import Product.Car;
import Product.Location;

public abstract class FactoryAbstract {
	public abstract Car createCar();
	public abstract Bike createBike();
}
