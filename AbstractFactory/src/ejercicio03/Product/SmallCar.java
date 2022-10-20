package ejercicio03.Product;

public class SmallCar extends Car {

	public SmallCar(Location location) {
		super(CarType.SMALL,location);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Building small car");
		// add accessories
	}
}