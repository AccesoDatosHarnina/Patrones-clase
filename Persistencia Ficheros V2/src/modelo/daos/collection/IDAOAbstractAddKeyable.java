package modelo.daos.collection;

import modelo.acceso.multi.Indicable;

public interface IDAOAbstractAddKeyable<T extends Indicable<K>, K> {
	public boolean add(T t);
	
}
