package Factory;


import Product.Car;
import Product.Location;
import Product.LuxuryCar;

public class FactoryLuxuryCar extends FactoryCar {

	@Override
	public Car factoryMethod(Location location) {
		return new LuxuryCar(location);
	}

}
