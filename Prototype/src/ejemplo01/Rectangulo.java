package ejemplo01;

public class Rectangulo implements Cloneable {
	private int lado;
	
	
	public Rectangulo clone() throws CloneNotSupportedException {
		return (Rectangulo) super.clone();
	}

	
	public Rectangulo(int lado) {
		super();
		this.lado = lado;
	}


	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
	
}
