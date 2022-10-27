package dao.abstracta.lista;

import java.util.List;

import base.Indicable;

public interface DAOAbstractLista<T extends List, S extends Indicable<K>, K> {
	public boolean add(S s);
	public S get(int posicion);
	public S buscar(K id);
	public boolean quitar(K id);
	public long getSize(); 
}
