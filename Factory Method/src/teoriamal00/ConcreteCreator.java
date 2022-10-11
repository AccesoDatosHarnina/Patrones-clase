package teoriamal00;

public class ConcreteCreator extends CreatorAbstract {

	@Override
	public ProductAbstract factoryMethod(int selector) {
		switch (selector) {
			case 1:
				return new ConcreteProductA();
			case 2:
				return new ConcreteProductB();
			case 3:
				return new ConcreteProductC();
		}
		return null;
	}
}
