package esquema;
public class Originator<T extends Cloneable > {
	T state;
	
	
	public Originator(T state) {
		super();
		this.state = state;
	}


	public Memento<T> save(){
		return new Memento<T>(this.state);
	}
	
	public void restore(Memento<T> memento) {
		state=memento.getState();
	}
	
	public void setState(T t) {
		this.state=t;
	}
}
