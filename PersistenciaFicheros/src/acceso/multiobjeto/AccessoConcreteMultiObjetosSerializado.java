package acceso.multiobjeto;

import base.IGrabador;
import base.IRecuperadorIndexado;

public class AccessoConcreteMultiObjetosSerializado<T , K> implements IAccessoAbstractMultiObjetos<T,K> {
	protected final IRecuperadorIndexado<T, K> recuperador;
	protected final IGrabador<T> grabador;
	protected boolean add = true;
	private String path;

	public AccessoConcreteMultiObjetosSerializado(String path, IGrabador<T> grabador, IRecuperadorIndexado<T, K> recuperado) {
		super();
		this.path=path;
		this.grabador=grabador;
		this.recuperador = recuperado;
	}

	@Override
	public boolean graba(T DTO) {
		return grabador.graba(path, DTO, add);
	}

	@Override
	public T recupera(K k) {
		return recuperador.recupera(path, k);
	}

	@Override
	public T recupera(int posicion) {
		return recuperador.recupera(path, posicion);
	}	
}
