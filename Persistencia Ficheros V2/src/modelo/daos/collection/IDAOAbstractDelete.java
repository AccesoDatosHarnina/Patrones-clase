package modelo.daos.collection;

public interface IDAOAbstractDelete<T,K> {
	public boolean quitar(K id);
}
