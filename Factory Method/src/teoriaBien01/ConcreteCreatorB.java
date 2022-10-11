package teoriaBien01;

public class ConcreteCreatorB implements CreatorAbstract {

	@Override
	public ProductAbstract factoryMethod() {
		return new ConcreteProductB();
	}

}
