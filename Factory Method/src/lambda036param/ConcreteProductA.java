package lambda036param;

public class ConcreteProductA extends Product {

	private int cosa;
	
	
	public ConcreteProductA(int cosa) {
		super();
		this.cosa = cosa;
	}


	@Override
	public void operacion() {
		// TODO Auto-generated method stub
		System.out.println("operacion del producto " + this.getClass().getName());
	}

}