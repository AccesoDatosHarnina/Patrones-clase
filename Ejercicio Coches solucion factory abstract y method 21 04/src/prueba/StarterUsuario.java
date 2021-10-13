package prueba;

import Factory.FactoryBike;
import Factory.FactoryLuxuryCar;
import Factory.FactoryUSA;
import Product.Bike;
import Product.Car;

public class StarterUsuario {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		FactoryUSA factoryAbstract = new FactoryUSA();
		FactoryLuxuryCar factoryCar = new FactoryLuxuryCar();
		Car car=cliente.getCar(factoryAbstract, factoryCar);
		Bike bike=cliente.getBike(FactoryBike.COUNTRY);
	}
}
