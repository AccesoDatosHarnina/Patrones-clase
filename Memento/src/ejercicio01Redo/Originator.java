package ejercicio01Redo;
public class Originator<T extends Clonable<T> > {
	T state;
	
	
	public Originator(T state) {
		super();
		this.state = state;
	}


	public Memento<T> save() throws CloneNotSupportedException{
		return new Memento<T>(this.state.clonar());
	}
	
	public void restore(Memento<T> memento) {
		state=memento.getState();
	}
	
	public void setState(T t) {
		this.state=t;
	}
}
