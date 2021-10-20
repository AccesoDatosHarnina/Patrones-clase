package nave02;

public class Armadura implements Nave{

	Nave nave;
	
	
	public Armadura(Nave nave) {
		super();
		this.nave = nave;
	}

	@Override
	public String dispara() {
		return nave.dispara();
	}

	@Override
	public Nave quitarDisparo() {
		return nave;
	}

	@Override
	public int ponerArmadura() {
		return nave.ponerArmadura()+1;
	}

	@Override
	public Nave quitarArmadura() {
		return nave;
	}

	@Override
	public Nave quitarCapa() {
		return nave.quitarCapa();
	}

}
