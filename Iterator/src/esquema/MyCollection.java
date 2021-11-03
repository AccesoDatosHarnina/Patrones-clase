package esquema;

import java.util.ArrayList;

public class MyCollection<T> implements IterableCollection<T> {

	private ArrayList<T> lista;
	

	public boolean add(T e) {
		return lista.add(e);
	}

	public MyCollection(ArrayList<T> lista) {
		super();
		this.lista = lista;
	}

	@Override
	public Iterator<T> createIterator() {
		return new IteradorConcreto<T>(this);
	}

	public T get(int i) {
		return this.lista.get(i);
	}

	public boolean hasMore(int iterationState) {
		return lista.size()>iterationState;
	}

}
