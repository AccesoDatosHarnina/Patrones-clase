package ejercicio01naveespacial;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Nave quitarDisparo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Nave quitarCapa() {
		return naveActual.quitarCapa();
	}

}
