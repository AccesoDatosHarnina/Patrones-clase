package acceso.collection;

import java.util.Collection;

import abstractProduct.IGrabador;
import abstractProduct.IRecuperadorUnitario;

public class AccesoConcreteCollection<T extends Collection> implements IAccessCollection<T>{
	private final IRecuperadorUnitario<T> recuperador;
	protected IGrabador grabador;
	protected String path;
	private final boolean add = false;

	public AccesoConcreteCollection(String path,IRecuperadorUnitario<T> recuperador,IGrabador grabador) {
		super();
		this.path=path;
		this.grabador = grabador;
		this.recuperador = recuperador;
	}

	public boolean graba(T DTO) {
		return grabador.graba(this.path, DTO, add);
	}

	public T recupera() {
		return recuperador.recupera(this.path);
	}

}
