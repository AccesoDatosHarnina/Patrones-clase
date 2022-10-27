package dao.concretas.lista;

import java.util.List;

import acceso.collection.IAccessCollection;
import base.Indicable;
import dao.abstracta.lista.DAOAbstractLista;

public class DaoConcreteLista<T extends List, S extends Indicable<K>, K> implements DAOAbstractLista<T, S, K> {
	private T lista;
	private String path;
	private IAccessCollection<T> daoArchivo;

	public long getSize() {
		if (lista == null)
			return 0;
		return lista.size();
	}

	public DaoConcreteLista(String path, List elementos, IAccessCollection<T> daoArchivo) {
		super();
		this.path = path;
		this.daoArchivo = daoArchivo;
		lista = daoArchivo.recupera();
		// personas == null
		if (lista == null) {
			lista = (T) elementos;
			daoArchivo.graba(lista);
		}
	}

	public boolean add(S s) {
		boolean add = lista.add(s);
		if (add) {
			add = daoArchivo.graba(lista);
			if (!add) {
				lista = daoArchivo.recupera();
			}
		}
		return add;
	}

	public S get(int posicion) {
		try {
			return (S) lista.get(posicion);
		} catch (Exception e) {
			return null;
		}
	}

	public S buscar(K id) {
		for (int i = 0; i < lista.size(); i++) {
			S s = (S) lista.get(i);
			if (s.getKey() == id) {
				return s;
			}

		}
		return null;
	}

	public boolean quitar(K id) {
		S busqueda = buscar(id);
		boolean respuesta = true;
		if (busqueda != null) {
			S remove = (S) lista.remove(lista.indexOf(busqueda));
			// ahora la version en memoria (ArrayList personas) es difente al del archivo
			if (remove != null) {
				respuesta = daoArchivo.graba(lista);
				if (!respuesta) {
					lista = daoArchivo.recupera();
				}
			}
		}
		return respuesta;
	}

}
