package modelo.acceso.collection;

import modelo.access.common.IAccessSave;

public interface IAccessSingleAccesible<T> extends IAccessSave<T>{
	public T get();
}
