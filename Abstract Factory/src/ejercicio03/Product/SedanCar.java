package ejercicio03.Product;

public class SedanCar extends Car {

	public SedanCar(Location location) {
		super(CarType.SEDAN,location);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Building sedan car");
		// add accessories
	}
}