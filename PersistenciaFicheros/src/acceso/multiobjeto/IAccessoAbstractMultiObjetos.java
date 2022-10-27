package acceso.multiobjeto;

public interface IAccessoAbstractMultiObjetos<T,K> {
	
	public boolean graba(T DTO);

	public T recupera(K k);

	public T recupera(int posicion);

}
