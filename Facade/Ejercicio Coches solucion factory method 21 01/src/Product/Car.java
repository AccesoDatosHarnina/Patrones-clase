package Product;

public abstract class Car {

	public Car(Location location){
		this.location = location;
	}

	protected abstract void construct();

	private Location location = null;

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Model- "+getClass().toString()+ " built in "+location;
	}
}