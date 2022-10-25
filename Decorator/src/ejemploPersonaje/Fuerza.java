package ejemploPersonaje;


public class Fuerza extends Caracteristica {
	Personaje personaje;

	public Fuerza(Personaje personaje) {
		this.personaje = personaje;
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
		return this.personaje.mostrarFuerza()+150;
	}

	

	

}
