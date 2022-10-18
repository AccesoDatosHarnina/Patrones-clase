package teoria;

public class ConcreteFactoryTwo implements AbstactFactory {

	@Override
	public AbstractProductA getProductA() {
		return new ProductATwo();
	}

	@Override
	public AbstractProductB getProductB() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String toString() {
		return "tipo B";
	}
}
