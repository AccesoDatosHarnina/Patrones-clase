package teoriabienparametrizada03;

public class ConcreteProduct extends Product {

	public int mipropiedad;

	private ConcreteProduct() {
		super();
	}

	public int getMipropiedad() {
		return mipropiedad;
	}

	public void setMipropiedad(int mipropiedad) {
		this.mipropiedad = mipropiedad;
	}

	private ConcreteProduct(int mipropiedad) {
		this();
		this.mipropiedad = mipropiedad;
	}

	@Override
	public void operacion() {
		// TODO Auto-generated method stub
		System.out.println("operacion del producto " + this.getClass().getName());
	}

	public static Product getProduct(int valor) {
		return new ConcreteProduct(valor);
	}
}