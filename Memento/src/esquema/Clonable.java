package esquema;

public interface Clonable<T> {
	public T clonar() throws CloneNotSupportedException;
}
