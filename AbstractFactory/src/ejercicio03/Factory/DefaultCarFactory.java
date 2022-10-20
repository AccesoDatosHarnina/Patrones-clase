package ejercicio03.Factory;
import ejercicio03.Product.Car;
import ejercicio03.Product.CarType;
import ejercicio03.Product.Location;
import ejercicio03.Product.LuxuryCar;
import ejercicio03.Product.SedanCar;
import ejercicio03.Product.SmallCar;

public class DefaultCarFactory
{
	public static Car buildCar(CarType model)
	{
		Car car = null;
		switch (model)
		{
			case SMALL:
			car = new SmallCar(Location.DEFAULT);
			break;

			case SEDAN:
			car = new SedanCar(Location.DEFAULT);
			break;

			case LUXURY:
			car = new LuxuryCar(Location.DEFAULT);
			break;

			default:
			//throw some exception
			break;
		}
		return car;
	}
}