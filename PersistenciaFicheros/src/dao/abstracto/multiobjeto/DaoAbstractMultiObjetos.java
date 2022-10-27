package dao.abstracto.multiobjeto;

public interface DaoAbstractMultiObjetos<T, K> {
	public boolean add(T t);
	public T buscar(K k) ;
	public T get(int posicion) ;
}
