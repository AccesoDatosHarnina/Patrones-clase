package ejercicio01;

public abstract class Ampliacion implements Nave {

	Nave envuelta;

	public Ampliacion(Nave envuelta) {
		super();
		this.envuelta = envuelta;
	}

}
