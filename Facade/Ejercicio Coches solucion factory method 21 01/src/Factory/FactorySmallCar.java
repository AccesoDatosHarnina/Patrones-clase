package Factory;

import Product.Car;
import Product.Location;
import Product.SmallCar;

public class FactorySmallCar extends FactoryCar {

	@Override
	public Car factoryMethod(Location location) {
		return new SmallCar(location);
	}

}
