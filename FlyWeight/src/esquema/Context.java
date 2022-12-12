package esquema;

public class Context {
	private int uniqueState;
	private Flyweight flyweight;

	public Context(int uniqueState, int repeatingState,FlyWeightFactory factory) {
		super();
		this.uniqueState = uniqueState;
		this.flyweight = factory.getFlyweight(repeatingState);
	}

	public void operation() {
		flyweight.operation(uniqueState);
	}
}
