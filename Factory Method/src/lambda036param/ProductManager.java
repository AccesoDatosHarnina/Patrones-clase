package lambda036param;

//Tu vas a ser singleton
public class ProductManager {
	
	
	//ya no se pueden crear objetos de esto
	private ProductManager() {
		super();
	}

	public static Product getProduct(Types type,int value) {
		return type.factoryMethod(value);
	}
}
