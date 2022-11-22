package ejemplo01;

public class Rectangulo implements Cloneable {
	
	public Rectangulo clone() throws CloneNotSupportedException {
		return (Rectangulo) super.clone();
	}
	private int lado;

	public Rectangulo(int lado) {
		super();
		this.lado = lado;
		String nn="sss";
	}


	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
	
}
