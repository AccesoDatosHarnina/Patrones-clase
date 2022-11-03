package modelo.acceso.collection;

import java.util.Collection;

import abstractProduct.IGrabador;
import abstractProduct.IRecuperador;
import abstractProduct.IRecuperadorUnitario;

public class AccessCollection<T extends Collection> implements IAccessSingleAccesible<T> {
	private final IRecuperador recuperador;
	protected IGrabador grabador;
	protected String path;
	private final boolean add = false;

	public AccessCollection(String path,IRecuperador recuperador,IGrabador grabador) {
		super();
		this.path=path;
		this.grabador = grabador;
		this.recuperador = recuperador;
	}

	@Override
	public boolean add(T DTO) {
		return grabador.graba(this.path, DTO, add);
	}

	@Override
	public T get() {
		return (T) ((IRecuperadorUnitario)recuperador).recupera(this.path);
	}

}
