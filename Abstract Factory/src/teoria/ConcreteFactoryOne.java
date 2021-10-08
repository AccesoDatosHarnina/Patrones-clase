package teoria;

public class ConcreteFactoryOne implements AbstractFactory {

	@Override
	public AbstractProductA createProductA() {
		return new ConcreteProductAOne();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ConcreteProductBOne();
	}

}
