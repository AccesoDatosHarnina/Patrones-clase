package ejemploPersonaje;

public class Armadura extends Caracteristica {

	public Armadura(Personaje personaje) {
		super(personaje);
	}

	@Override
	public int mostrarArmadura() {
		return this.personaje.mostrarArmadura() + 50;

	}

	@Override
	public Personaje decrementaElemento() {
		System.out.println("Quiero degradar");
		return personaje;
	}

	@Override
	public int mostrarFuerza() {
		return this.personaje.mostrarFuerza();
	}


}
