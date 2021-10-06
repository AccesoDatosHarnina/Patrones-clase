package ejemplo01;

public class Grupo implements Cloneable {
	private Rectangulo miREc;
	private String nombre;

	public Grupo clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Grupo) super.clone();
	}
}
