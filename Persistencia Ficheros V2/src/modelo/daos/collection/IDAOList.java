package modelo.daos.collection;

import modelo.acceso.multi.Indicable;

public interface IDAOList<T,S extends Indicable<K>,K>  {
//	extends IDAOAbstractAddKeyable<S, K>,IDAOAbstractDelete<T, K>,IAccessMultiAccesibleGetByKey<T, K>, IAccessAbstractGetByPosition<S, K>
	public int getSize();
	public boolean add(S s);
	public S getByPosition(int posicion); 
	public S getByKey(K id);
	public boolean delete(K id);
	
}
