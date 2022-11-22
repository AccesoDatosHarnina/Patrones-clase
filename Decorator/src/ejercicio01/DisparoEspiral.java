package ejercicio01;

public class DisparoEspiral extends Ampliacion {

	public DisparoEspiral(Nave envuelta) {
		super(envuelta);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String dispara() {
		return envuelta.dispara() + "disparo espiral";
	}

	@Override
	public Nave quitarDisparo() {
		// TODO Auto-generated method stub
		return null;
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

	@Override
	public Nave quitarCapa() {
		// TODO Auto-generated method stub
		return null;
	}

}
