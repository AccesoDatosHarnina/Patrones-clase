package arma03;

public class Armadura extends Nave {


	public Armadura(Nave actual) {
		super(actual);
	}

	@Override
	public int ponerArmadura() {		
		return actual.ponerArmadura()+1;
	}

	@Override
	public Nave quitarArmadura() {
		return actual;
	}

	@Override
	public String dispara() {
		return actual.dispara();
	}

	@Override
	public Nave quitarCapa() {
		return actual;
	}

}
