package ejercicio03.Factory;
import ejercicio03.Product.Car;
import ejercicio03.Product.CarType;
import ejercicio03.Product.Location;
import ejercicio03.Product.LuxuryCar;
import ejercicio03.Product.SedanCar;
import ejercicio03.Product.SmallCar;

public class AsiaCarFactory
{
	public static Car buildCar(CarType model)
	{
		//Ahora podemos crear el producto concreto pasando por parametros los
		//valores de construccion del objeto que necesitemos
		Car car = null;
		switch (model)
		{
			case SMALL:
			car = new SmallCar(Location.ASIA);
			break;

			case SEDAN:
			car = new SedanCar(Location.ASIA);
			break;

			case LUXURY:
			car = new LuxuryCar(Location.ASIA);
			break;

			default:
			//throw some exception
			break;
		}
		return car;
	}
}