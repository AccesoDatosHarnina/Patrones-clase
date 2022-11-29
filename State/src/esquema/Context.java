package esquema;

public class Context {
	private State state;
	private int value;
	
	public Context(State state) {
		super();
		this.state = state;
		this.state.setContext(this);
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void changeState(State state) {
		this.state=state;
		this.state.setContext(this);
	}

	public void doThis() {
		state.doThis();
		
	}

	public void doThat() {
		state.doThat();
		
	}

	private State getState() {
		return state;
	}

	int getValue() {
		return value;
	}

	
}
