package arma03;

public abstract class Nave {

	protected Nave actual;
	

	public Nave(Nave actual) {
		super();
		this.actual = actual;
	}

	public Nave() {
		super();
	}

	public abstract String dispara();

	public abstract int ponerArmadura();

	public abstract Nave quitarArmadura();

	public abstract Nave quitarCapa();
}
