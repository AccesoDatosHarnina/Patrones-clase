package concreteFactory.serializado;

import abstractFactory.AbstractAccess;
import abstractProduct.IGrabador;
import abstractProduct.IRecuperador;
import concreteProducts.serializado.GrabadorSerializado;
import concreteProducts.serializado.RecuperadorIndexadoSerializado;
import modelo.acceso.multi.Indicable;

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
