package ejercicio03.Principal;
import Factory.CarFactory;
import Product.Car;
import Product.CarType;
import Product.Location;

public class TestFactoryPattern
{
	public static void main(String[] args)
	{
		//Creamos el Producto diciendo que queremos un coche de tipo SMALL
		System.out.println(CarFactory.buildCar(CarType.SMALL,Location.ASIA));
		System.out.println(CarFactory.buildCar(CarType.SEDAN,Location.USA));
		System.out.println(CarFactory.buildCar(CarType.LUXURY,Location.USA));
		
		
		Car Micoche=CarFactory.buildCar(CarType.SEDAN, Location.USA);
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