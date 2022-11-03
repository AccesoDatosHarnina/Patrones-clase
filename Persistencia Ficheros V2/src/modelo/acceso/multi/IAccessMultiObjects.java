package modelo.acceso.multi;

import modelo.access.common.IAccessAbstractGetByPosition;
import modelo.access.common.IAccessSave;

public interface IAccessMultiObjects<T,K> extends IAccessSave<T>,IAccessAbstractGetByPosition<T,K>,IAccessMultiAccesibleGetByKey<T, K> {

}
