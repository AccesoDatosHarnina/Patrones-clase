package Factory;

import Product.Car;
import Product.Location;

public abstract class FactoryCar {
	public abstract Car factoryMethod(Location location);
}
