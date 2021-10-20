package ejercicio01naveespacial;

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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Nave quitarArmadura() {
		// TODO Auto-generated method stub
		return null;
	}

}
