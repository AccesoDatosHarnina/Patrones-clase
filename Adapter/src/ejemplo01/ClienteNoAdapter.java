package ejemplo01;

public class ClienteNoAdapter {
	public PersonaV1 persona;

	public ClienteNoAdapter(PersonaV1 personaV1) {
		super();
		this.persona = personaV1;
	}

	public void hazAlgo() {
		System.out.println(persona.getNombre());

	}
}
