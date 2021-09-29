package teoriaBien01;

public class ConcreteCreatorB extends CreatorAbstract {

	@Override
	public ProductAbstract factoryMethod() {
		return new ConcreteProductB();
	}

}
