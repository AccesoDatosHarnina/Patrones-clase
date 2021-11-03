package esquema;

public class IteradorConcreto<T> implements Iterator<T> {

	private MyCollection<T> colection;
	private int iterationState=0;
	
	public IteradorConcreto(MyCollection<T> colection) {
		super();
		this.colection = colection;
	}

	@Override
	public T getNext() {
		return this.colection.get(iterationState++);
	}

	@Override
	public boolean hasMore() {
		return this.colection.hasMore(iterationState);
	}

}
