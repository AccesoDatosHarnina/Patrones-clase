package ejemplo01;

public class Adaptador {
	
	PersonaV2 personaV2;
	
	

	public Adaptador(PersonaV2 personaV2) {
		super();
		this.personaV2 = personaV2;
	}


	public String getNombre() {
		return personaV2.getNombre().getNombre();
	}

}
