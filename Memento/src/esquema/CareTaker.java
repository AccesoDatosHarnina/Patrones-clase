package esquema;

import java.util.Stack;

public class CareTaker<T> {
	private Originator<T> originator;
	private Stack<Memento<T>> mementos = new Stack<>();

	public CareTaker(Originator<T> originator) {
		super();
		this.originator = originator;
	}

	public void doSomething() {
		Memento<T> save  = originator.save();
		mementos.push(save);
	}
	
	public void undo() {
		Memento<T> pop = mementos.pop();
		if(pop!=null) {
			originator.restore(pop);
		}
	}
}
