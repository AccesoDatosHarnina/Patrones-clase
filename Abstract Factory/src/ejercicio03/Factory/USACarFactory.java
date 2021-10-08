package ejercicio03.Factory;
import Product.Car;
import Product.CarType;
import Product.Location;
import Product.LuxuryCar;
import Product.SedanCar;
import Product.SmallCar;

public class USACarFactory
{
	public static Car buildCar(CarType model)
	{
		Car car = null;
		switch (model)
		{
			case SMALL:
			car = new SmallCar(Location.USA);
			break;

			case SEDAN:
			car = new SedanCar(Location.USA);
			break;

			case LUXURY:
			car = new LuxuryCar(Location.USA);
			break;

			default:
			//throw some exception
			break;
		}
	return car;
	}
}