package ejemplo01;

public class Cliente {

	public static void main(String[] args) {
		DePie dePie=new DePie();
		Persona persona=new Persona(dePie);
		persona.hazPipi();
		System.out.println("estado de la vejiga "+persona.getVejiga());
		Sentado sentado=new Sentado();
		sentado.setPersona(persona);
		persona.setState(sentado);
		persona.hazPipi();
		System.out.println("estado de la vejiga "+persona.getVejiga());
	}

}
