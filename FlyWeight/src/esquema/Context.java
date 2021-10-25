package esquema;

public class Context {
	private UniqueAbstractState uniqueAbstractState;
	private FlyWeight flyWeight;

	public Context(UniqueAbstractState uniqueAbstractState, RepeatingAbstactState repeatingAbstactState) {
		super();
		this.uniqueAbstractState = uniqueAbstractState;
		flyWeight = FlyWeightFactory.getFlyWeight(repeatingAbstactState);
	}

	public void operation() {
		flyWeight.operation(uniqueAbstractState);
	}
}
