package esquema;

public class FlyWeight {
	private RepeatingAbstactState repeatingAbstactState;

	public FlyWeight(RepeatingAbstactState repeatingAbstactState) {
		super();
		this.repeatingAbstactState = repeatingAbstactState;
	}
	
	public void operation(UniqueAbstractState uniqueAbstractState) {
		
	}
}
