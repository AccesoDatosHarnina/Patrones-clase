package ejemplo01;

public class Sentado implements Pipiable {

	Persona contexto;

	public void setPersona(Persona persona) {
		contexto = persona;
	}

	@Override
	public void hazPipi() {
		System.out.println("sentado");
		contexto.setVejiga(1);
	}

}
