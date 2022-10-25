package Factory;

import Product.Car;
import Product.Location;
import Product.SedanCar;

public class FactorySedanCar extends FactoryCar {

	@Override
	public Car factoryMethod(Location location) {
		return new SedanCar(location);
	}

}
