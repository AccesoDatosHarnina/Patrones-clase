package arma03;

public class NaveBase extends Nave {
	

	public NaveBase() {		
	}

	@Override
	public String dispara() {
		return "disparo Simple";
		
	}

	@Override
	public int ponerArmadura() {
		return 0;
	}

	@Override
	public Nave quitarArmadura() {
		return this;
		}

	@Override
	public Nave quitarCapa() {
		return this;
	}

}
