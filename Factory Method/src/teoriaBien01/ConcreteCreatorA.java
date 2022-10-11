package teoriaBien01;

public class ConcreteCreatorA implements CreatorAbstract {

	@Override
	public ProductAbstract factoryMethod() {
			return new ConcreteProductA();
	}
}
