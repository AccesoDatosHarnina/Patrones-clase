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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Nave quitarArmadura() {
		// TODO Auto-generated method stub
		return null;
	}

}
