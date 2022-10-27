package base;

public interface IRecuperadorIndexado<T, K> {
	T recupera(String path, K k);

	T recupera(String path, int posicion);
}
