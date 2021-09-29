package teroiabienactual02;

import java.util.function.Supplier;

public enum Types {
	A(() -> {
		return new ConcreteProductA();
	}), B(() -> {
		return new ConcreteProductB();
	}), C(() -> {
		return new ConcreteProductC();
	}),
	// sin lambda
	D(new Supplier<Product>() {

		@Override
		public Product get() {
			return new ConcreteProductA();
		}
	}),
//	Otra forma de crearlo
	E(new MiSupplierA());

	private Supplier<Product> supplier;

	private Types(Supplier<Product> supplier) {
		this.supplier = supplier;
	}

	public Product factoryMethod() {
		return supplier.get();
	}
}
