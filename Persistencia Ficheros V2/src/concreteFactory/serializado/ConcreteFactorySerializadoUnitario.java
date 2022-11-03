package concreteFactory.serializado;

import abstractFactory.AbstractAccess;
import abstractProduct.IGrabador;
import abstractProduct.IRecuperador;
import abstractProduct.IRecuperadorUnitario;
import concreteProducts.serializado.GrabadorSerializado;
import concreteProducts.serializado.RecuperadorUnitarioSerializado;

public class ConcreteFactorySerializadoUnitario<T> implements AbstractAccess<T> {

	@Override
	public IRecuperador getRecuperador() {
		return new RecuperadorUnitarioSerializado<T>();
	}

	@Override
	public IGrabador<T> getGrabador() {
		return new GrabadorSerializado<T>();
	}

}
