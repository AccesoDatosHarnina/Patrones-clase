package esquema;

public class RefinedAbstraction extends Bridge {

	public RefinedAbstraction(Implementation implementation) {
		super(implementation);
	}

	public void featureC() {
		implementation.methodOne();
		implementation.methodThree();
	}
}
