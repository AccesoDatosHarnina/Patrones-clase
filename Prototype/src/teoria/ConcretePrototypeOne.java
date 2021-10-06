package teoria;

public class ConcretePrototypeOne implements Prototype {
	public int fieldOne=0;

	@Override
	public Prototype clonar() {
		return new ConcretePrototypeOne(this);
	}

	public ConcretePrototypeOne(ConcretePrototypeOne prototype) {
		super();
		this.fieldOne = prototype.fieldOne;
	}

	
	public ConcretePrototypeOne() {
		super();
	}

	@Override
	public void present() {
		System.out.println("Hola mi valor es "+fieldOne);
		
	}

}
