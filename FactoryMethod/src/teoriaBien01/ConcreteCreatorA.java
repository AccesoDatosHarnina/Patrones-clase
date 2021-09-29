package teoriaBien01;

public class ConcreteCreatorA extends CreatorAbstract {

	@Override
	public ProductAbstract factoryMethod() {
			return new ConcreteProductA();
	}
}
