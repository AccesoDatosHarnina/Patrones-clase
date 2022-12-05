package ejemplo01;

public class DePie implements Pipiable{

	Persona contexto;
	
	public void setPersona(Persona persona) {
		contexto=persona;
	}
	@Override
	public void hazPipi() {
		System.out.println("lo hago de pie");
		contexto.setVejiga(0);
	}

}
