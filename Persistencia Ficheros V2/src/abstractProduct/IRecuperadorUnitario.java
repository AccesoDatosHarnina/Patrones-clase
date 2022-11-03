package abstractProduct;

public interface IRecuperadorUnitario<T> extends IRecuperador{
	public T recupera(String path);
}
