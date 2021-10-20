package ejercicio01naveespacial;

public class NaveBase implements Nave {

	@Override
	public String dispara() {
		return "disparo simple";
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
	public Nave quitarDisparo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Nave quitarCapa() {
		return this;
	}

}
