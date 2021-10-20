package arma03;

public class Disparo extends Nave {


	public Disparo(Nave actual) {
		super(actual);
	}

	@Override
	public String dispara() {
		return actual.dispara()+"disparo simple";
	};

	@Override
	public Nave quitarCapa() {
		return this.actual;
	}

	@Override
	public int ponerArmadura() {
		return actual.ponerArmadura();
	}

	@Override
	public Nave quitarArmadura() {
		return actual.quitarArmadura();
	}

}
