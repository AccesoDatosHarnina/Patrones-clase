package modelo.daos.collection;

import java.util.List;

import abstractFactory.AbstractAccess;
import modelo.acceso.collection.AccessCollection;
import modelo.acceso.collection.IAccessSingleAccesible;
import modelo.acceso.multi.Indicable;

public class DaoLista<T extends List, S extends Indicable<K>, K> implements IDAOList<T, S, K> {
	private T lista;
	private String path;
	private IAccessSingleAccesible<T> daoArchivo;

	public int getSize() {
		if (lista != null)
			return lista.size();
		return 0;
	}

	public DaoLista(String path, List elementos,AbstractAccess<T> daos) {
		super();
		this.path = path;
		this.daoArchivo = new AccessCollection<T>(path, daos.getRecuperador(),	daos.getGrabador());
		lista = daoArchivo.get();
		// personas == null
		if (lista == null) {
			lista = (T) elementos;
			daoArchivo.add(lista);
		}
	}

	@Override
	public boolean add(S s) {
		boolean add = lista.add(s);
		if (add) {
			add = daoArchivo.add(lista);
			if (!add) {
				lista = daoArchivo.get();
			}
		}
		return add;
	}

	@Override
	public S getByPosition(int posicion) {
		try {
			return (S) lista.get(posicion);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public S getByKey(K id) {
		for (int i = 0; i < lista.size(); i++) {
			S s = (S) lista.get(i);
			if (((Indicable<K>) s).getKey() == id) {
				return s;
			}

		}
		return null;
	}

	@Override
	public boolean delete(K id) {
		S busqueda = getByKey(id);
		boolean respuesta = true;
		if (busqueda != null) {
			S remove = (S) lista.remove(lista.indexOf(busqueda));
			// ahora la version en memoria (ArrayList personas) es difente al del archivo
			if (remove != null) {
				respuesta = daoArchivo.add(lista);
				if (!respuesta) {
					lista = daoArchivo.get();
				}
			}
		}
		return respuesta;
	}

}
