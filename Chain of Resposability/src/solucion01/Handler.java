package solucion01;

public interface Handler {

	public void setNext(Handler handler);
	public void handle(ObjectOfManaging request);
}
