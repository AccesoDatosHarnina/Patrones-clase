package teoria;

public class ConcreteFactoryOne implements AbstactFactory {

	@Override
	public AbstractProductA getProductA() {
		return new ProductAOne();
	}

	@Override
	public AbstractProductB getProductB() {
		return new ProductBOne();
	}

}
