package ejercicio02.abstracto;

public abstract class Factory {
	private static Factory factory;

	protected Factory() {
		super();
	}

	public static Factory getFactory() {
		return factory;
	}

	public static void setFactory(Factory factoryE) {
		factory = factoryE;
	}
	
	public abstract ProductA getProductA();
	public abstract ProductB getProductB();
}
