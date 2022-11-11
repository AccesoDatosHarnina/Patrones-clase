package ejercicio01;

public class DisparoDoble extends Ampliacion {

	public DisparoDoble(Nave envuelta) {
		super(envuelta);
	}

	@Override
	public String dispara() {
		return this.envuelta.dispara()+"otro disparo simple";
	}

	@Override
	public Nave quitarDisparo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int ponerArmadura() {
		return this.envuelta.ponerArmadura();
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
