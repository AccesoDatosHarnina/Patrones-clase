package nave02;

public class DisparoSuper implements Nave {

	private Nave nave;

	
	public DisparoSuper(Nave nave) {
		super();
		this.nave = nave;
	}

	@Override
	public String dispara() {
		return "disparo superior";
	}

	@Override
	public int ponerArmadura() {
		return nave.ponerArmadura();
	}

	@Override
	public Nave quitarArmadura() {
		return nave;
	}

	@Override
	public Nave quitarDisparo() {
		return nave;
	}

	@Override
	public Nave quitarCapa() {
		return nave.quitarCapa();
	}

}
