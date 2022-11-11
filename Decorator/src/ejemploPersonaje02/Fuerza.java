package ejemploPersonaje02;

public class Fuerza extends Caracteristica {

	public Fuerza(Personaje aldeano) {
		super(aldeano);
	}

	@Override
	public int mostrarArmadura() {
		return this.personaje.mostrarArmadura();
	}

	@Override
	public Personaje decrementaElemento() {
		return this.personaje;
	}

	@Override
	public int mostrarFuerza() {
		return this.personaje.mostrarFuerza() + 150;
	}

}
