package abstractProduct;

public interface IGrabador<T>{
	public boolean graba(String path,T dto,boolean add);
}
