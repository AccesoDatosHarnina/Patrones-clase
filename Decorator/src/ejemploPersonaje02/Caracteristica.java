package ejemploPersonaje02;

public abstract class Caracteristica implements Personaje {
	Personaje personaje;
	
	public Caracteristica(Personaje personaje) {
		super();
		this.personaje = personaje;
	}

	public abstract int mostrarArmadura();

	public abstract Personaje decrementaElemento();
	
	public Personaje degradaTotal() {
		return personaje.degradaTotal();
		
	}

}
