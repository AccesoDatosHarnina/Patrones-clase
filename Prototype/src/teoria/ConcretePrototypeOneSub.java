package teoria;

public class ConcretePrototypeOneSub extends ConcretePrototypeOne {
	public int fieldTwo = 1;

	@Override
	public Prototype clonar() {
		return new ConcretePrototypeOneSub(this);
	}

	public ConcretePrototypeOneSub(ConcretePrototypeOneSub prototype) {
		super(prototype);
		this.fieldTwo = prototype.fieldTwo; 
	}
	
	public ConcretePrototypeOneSub() {
		super();
	}

	@Override
	public void present() {
		super.present();
		System.out.println("mi valor de fieldTwo "+fieldTwo);
	}
}
