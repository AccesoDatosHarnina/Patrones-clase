package dao.concreto.multiobjeto;

import acceso.multiobjeto.IAccessoAbstractMultiObjetos;
import dao.abstracto.multiobjeto.DaoAbstractMultiObjetos;

public class DaoConcreteMultiObjetos<T, K> implements DaoAbstractMultiObjetos<T,K>{
	private String path;
	private IAccessoAbstractMultiObjetos<T, K> daoArchivo;

	public DaoConcreteMultiObjetos(String path,IAccessoAbstractMultiObjetos<T, K> daoArchivo) {
		super();
		this.path = path;
		this.daoArchivo = daoArchivo;
	}

	public boolean add(T t) {
		return daoArchivo.graba(t);
	}

	public T buscar(K k) {
		return (T) daoArchivo.recupera(k);
	}

	public T get(int posicion) {
		return (T) daoArchivo.recupera(posicion);
	}

}
