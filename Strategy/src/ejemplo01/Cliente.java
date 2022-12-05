package ejemplo01;

public class Cliente {

	public static void main(String[] args) {
		DePie dePie=new DePie();
		Persona persona=new Persona();
		persona.setStrategy(dePie);
		persona.hazPipi();
		System.out.println("estado de la vejiga "+persona.vejiga.estadoActual);
		Sentado sentado=new Sentado();
		persona.setStrategy(sentado);
		persona.hazPipi();
		System.out.println("estado de la vejiga "+persona.vejiga.estadoActual);
	}

}
