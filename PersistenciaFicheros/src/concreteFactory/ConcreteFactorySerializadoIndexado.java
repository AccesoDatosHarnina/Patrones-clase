package concreteFactory;

import abstractFactory.AbstractAccess;
import abstractProduct.IGrabador;
import abstractProduct.IRecuperador;
import base.Indicable;
import concreteProducts.GrabadorSerializado;
import concreteProducts.RecuperadorIndexadoSerializado;

public class ConcreteFactorySerializadoIndexado<T extends Indicable<K>,K> implements AbstractAccess<T> {

	@Override
	public IRecuperador getRecuperador() {
		return new RecuperadorIndexadoSerializado<T,K>();
	}

	@Override
	public IGrabador<T> getGrabador() {
		return new GrabadorSerializado<>();
	}

}
