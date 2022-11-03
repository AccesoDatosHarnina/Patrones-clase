package modelo.daos.multi;

import abstractFactory.AbstractAccess;
import modelo.acceso.multi.AccessMultiObjetosSerializado;

public class DaoMultiObjetos<T, K> implements IDAOMultiObjects<T,K>{
	// implements IAccessMultiObjects<T, K>
	private String path;
	AccessMultiObjetosSerializado<T,K> accessArchive;

	public DaoMultiObjetos(String path,AbstractAccess<T> daos) {
		super();
		this.path = path;
		 accessArchive = new AccessMultiObjetosSerializado<T, K>(path,daos.getGrabador(),daos.getRecuperador());
	}

	
	@Override
	public T getByPosition(int posicion) {
		return (T) accessArchive.getByPosition(posicion);
	}

	@Override
	public boolean add(T t) {
		return accessArchive.add(t);
	}

	@Override
	public T getByKey(K k) {
		return (T) accessArchive.getByKey(k);
	}

}
