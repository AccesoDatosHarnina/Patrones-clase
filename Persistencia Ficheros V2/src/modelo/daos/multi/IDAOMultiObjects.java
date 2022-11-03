package modelo.daos.multi;

public interface IDAOMultiObjects<T, K> {
	public boolean add(T t);

	public T getByKey(K k);

	public T getByPosition(int posicion);
}
