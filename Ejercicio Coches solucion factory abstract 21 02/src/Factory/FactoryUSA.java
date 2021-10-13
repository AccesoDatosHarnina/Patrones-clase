package Factory;

import Product.Bike;
import Product.Car;
import Product.CountryBike;
import Product.Location;
import Product.LuxuryCar;

public class FactoryUSA extends FactoryAbstract {

	@Override
	public Car createCar() {
		return new LuxuryCar(Location.USA);
	}

	@Override
	public Bike createBike() {
		return new CountryBike();
	}

}
