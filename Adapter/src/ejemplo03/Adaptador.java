package ejemplo03;

public class Adaptador {

	public Direccion adapt(Persona persona) {
		return new Direccion(persona.localidad);
	}
}
