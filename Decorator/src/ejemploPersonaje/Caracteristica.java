package ejemploPersonaje;

public abstract class Caracteristica extends Personaje {
	Personaje personaje;
	
	public Caracteristica(Personaje personaje) {
		super();
		this.personaje = personaje;
	}

	public abstract int mostrarArmadura();

	public abstract Personaje decrementaElemento();
	
	public Personaje degradaTotal() {
		Caracteristica actual= (Caracteristica) personaje;
		while(!(actual.personaje.getClass().equals(Aldeano.class))) {
			actual=(Caracteristica) actual.personaje;
		}
		return actual.personaje;
		
	}

}
