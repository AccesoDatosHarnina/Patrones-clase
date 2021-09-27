package teoria00;

public class ConcreteCreatorA extends CreatorAbstract {

	@Override
	public ProductAbstract factoryMethod(int selector) {
		switch (selector) {
		case 1:
			return new ConcreteProductA();
		case 2:
			return new ConcreteProductB();
		}
		return null;
	}

}
