package ejercicio01Redo;

public class Memento<T> {
	T state;

	public Memento(T state) {
		super();
		this.state = state;
	}

	public T getState() {
		return state;
	}
	
	

}
