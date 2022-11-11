package ejemploPersonaje02;

public class Aldeano implements Personaje {

	@Override
	public int mostrarArmadura() {
		return 0;

	}

	@Override
	public Personaje decrementaElemento() {
		return this;
	}

	@Override
	public int mostrarFuerza() {

		return 0;
	}

	@Override
	public Personaje degradaTotal() {
		return this;
	}

}
