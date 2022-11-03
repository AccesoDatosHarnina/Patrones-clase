package abstractProduct;

public interface IRecuperadorIndexado<T, K> extends IRecuperador{
	T recupera(String path, K k);

	T recupera(String path, int posicion);
}
