package ejemplo01;

public class Grupo implements Cloneable {
	private Rectangulo miREc;
	private String nombre;

	
	public Rectangulo getMiREc() {
		return miREc;
	}


	public String getNombre() {
		return nombre;
	}


	public Grupo(String nombre) {
		super();
		this.nombre = nombre;
		miREc=new Rectangulo(9);
	}


	public Grupo clone() throws CloneNotSupportedException {
		Grupo clone = (Grupo) super.clone();
		clone.miREc=miREc.clone();
		clone.nombre=new String(nombre);
		return clone;
	}
}
