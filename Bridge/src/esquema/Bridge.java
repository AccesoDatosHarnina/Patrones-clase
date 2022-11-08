package esquema;

public class Bridge {
	// Que a pesar de su nombre es instaciable
	//o sea que no es abstracta
	Implementation implementation;

	public Bridge(Implementation implementation) {
		super();
		this.implementation = implementation;
	}
	
	public void featureA() {
		this.implementation.methodOne();
		this.implementation.methodFour();
	}
	
	public void featureB() {
		this.implementation.methodTwo();
	}

	public void setImplementation(Implementation implementation) {
		this.implementation = implementation;
	}
	
}
