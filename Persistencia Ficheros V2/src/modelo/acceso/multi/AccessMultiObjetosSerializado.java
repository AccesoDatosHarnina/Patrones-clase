package modelo.acceso.multi;

import abstractProduct.IGrabador;
import abstractProduct.IRecuperador;
import abstractProduct.IRecuperadorIndexado;

public class AccessMultiObjetosSerializado<T, K> implements IAccessMultiObjects<T,K> {
	protected final IRecuperador recuperador;
	protected final IGrabador<T> grabador;
	protected boolean add = true;
	private String path;

	public AccessMultiObjetosSerializado(String path, IGrabador<T> grabador, IRecuperador recuperado) {
		super();
		this.path = path;
		this.grabador = grabador;
		this.recuperador = recuperado;
	}

	// IAccessSave
	@Override
	public boolean add(T DTO) {
		return grabador.graba(path, DTO, add);
	}

	// IAccessMultiAccesibleGetByKey
	@Override
	public T getByKey(K k) {
		return ((IRecuperadorIndexado<T, K>) recuperador).recupera(path, k);
	}

	// IAccessAbstractSeek
	@Override
	public T getByPosition(int posicion) {
		return ((IRecuperadorIndexado<T, K>) recuperador).recupera(path, posicion);
	}
}
