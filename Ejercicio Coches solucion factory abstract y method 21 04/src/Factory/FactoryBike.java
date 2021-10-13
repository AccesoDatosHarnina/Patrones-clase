package Factory;

import java.util.function.Supplier;

import Product.Bike;
import Product.CountryBike;
import Product.RaceBike;
import Product.VespaBike;

public enum FactoryBike {
	VESPA(() -> {
		return new VespaBike();
	}), COUNTRY(() -> {
		return new CountryBike();
	}), RACE(() -> {
		return new RaceBike();
	});
	private Supplier<Bike> supplier;

	private FactoryBike(Supplier<Bike> supplier) {
		this.supplier = supplier;
	}
	public Bike getBike() {
		return supplier.get();
	}
}
