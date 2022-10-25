package ejemploPersonaje;

public class Aldeano extends Personaje {

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

}
