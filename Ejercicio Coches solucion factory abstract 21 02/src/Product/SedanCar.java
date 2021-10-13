package Product;

public class SedanCar extends Car {

	public SedanCar(Location location) {
		super(location);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Building sedan car");
		// add accessories
	}
}