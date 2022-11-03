package abstractFactory;

import abstractProduct.IGrabador;
import abstractProduct.IRecuperador;

public interface AbstractAccess<T> {
	public IRecuperador getRecuperador();
	public IGrabador<T> getGrabador();
}
