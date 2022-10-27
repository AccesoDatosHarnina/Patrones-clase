package acceso.collection;

import java.util.Collection;

public interface IAccessCollection<T extends Collection> {
	public boolean graba(T DTO);
	public T recupera();
}
