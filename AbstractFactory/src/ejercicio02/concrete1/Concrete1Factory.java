package ejercicio02.concrete1;

import ejercicio02.abstracto.Factory;
import ejercicio02.abstracto.ProductA;
import ejercicio02.abstracto.ProductB;

public class Concrete1Factory extends Factory {
	
	public Concrete1Factory() {
		super();
	}
	
	@Override
	public ProductA getProductA() {
		return new ProductA1();
	}

	@Override
	public ProductB getProductB() {
		return new ProductB1();
	}

}
