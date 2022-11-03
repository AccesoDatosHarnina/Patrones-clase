package concreteFactory;

import abstractFactory.AbstractAccess;
import abstractProduct.IGrabador;
import abstractProduct.IRecuperador;
import concreteProducts.GrabadorSerializado;
import concreteProducts.RecuperadorUnitarioSerializado;

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
