package esquema;

public class Abstraction {
	// Que a pesar de su nombre es instaciable
	//o sea que no es abstracta
	Implementation implementation;

	public Abstraction(Implementation implementation) {
		super();
		this.implementation = implementation;
	}
	
	public void featureA() {
		this.implementation.methodOne();
	}
	
	public void featureB() {
		this.implementation.methodTwo();
	}

	public void setImplementation(Implementation implementation) {
		this.implementation = implementation;
	}
	
}
