package nave02;

public class DisparoLateral implements Nave {

	private Nave naveActual;
	
	public DisparoLateral(Nave naveActual) {
		super();
		this.naveActual = naveActual;
	}

	@Override
	public String dispara() {
		return naveActual.dispara()+" "+"disparo lateral";
	}

	@Override
	public int ponerArmadura() {
		return naveActual.ponerArmadura();
	}

	@Override
	public Nave quitarArmadura() {
		return naveActual;
	}

	@Override
	public Nave quitarDisparo() {
		return naveActual;
	}

	@Override
	public Nave quitarCapa() {
		return naveActual.quitarCapa();
	}

}
