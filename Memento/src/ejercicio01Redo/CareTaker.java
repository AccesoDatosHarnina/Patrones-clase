package ejercicio01Redo;

import java.util.LinkedList;

public class CareTaker<T extends Clonable<T>> {
	private Originator<T> originator;
	private LinkedList<Memento<T>> mementos = new LinkedList<>();
	private int currentState = -1;
	

	public CareTaker(Originator<T> originator) {
		super();
		this.originator = originator;
	}

	public void doSomething() throws CloneNotSupportedException {
		Memento<T> save = originator.save();
		if (mementos.add(save)) {
			currentState++;
		}
	}

	public void undo() {
		if (currentState > 0) {
			Memento<T> pop = mementos.get(--currentState);
			if (pop != null) {
				originator.restore(pop);
			}
		}
	}

	public void redo() {
		if(currentState<mementos.size()-1) {
			Memento<T> pop = mementos.get(++currentState);
			if (pop != null) {
				originator.restore(pop);
			}
		}
	}
}
