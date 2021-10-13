package Principal;
import Factory.FactoryBike;
import Factory.FactoryLuxuryCar;
import Factory.FactoryUSA;
import Product.Bike;
import Product.Car;
import Product.Location;
import Product.LuxuryCar;

public class TestFactoryPattern
{
	public static void main(String[] args)
	{
		//Creamos el Producto diciendo que queremos un coche de tipo SMALL
		System.out.println(new LuxuryCar(Location.USA));
		
		Car Micoche=new FactoryUSA().createCar(new FactoryLuxuryCar());
		Bike bike=new FactoryUSA().createBike(FactoryBike.COUNTRY);
		System.out.println(Micoche.getLocation());
		System.out.println(Micoche.getClass());
		
	}
}
/*
Output: (Default location is Asia)

Building small car
Model- SMALL built in ASIA
Building sedan car
Model- SEDAN built in ASIA
Building luxury car
Model- LUXURY built in ASIA
*/