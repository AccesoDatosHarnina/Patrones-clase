package Product;

public class SmallCar extends Car {

	public SmallCar(Location location) {
		super(location);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Building small car");
		// add accessories
	}
}