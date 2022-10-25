package ejercicio01;

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
		return this;
	}

	@Override
	public Nave quitarDisparo() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public Nave quitarCapa() {
		return this;
	}

}
