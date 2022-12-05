package ejemplo01;

public class Sentado implements Pipiable {
	
	@Override
	public void hazPipi(Vejiga vejiga) {
		System.out.println("sentado");
		vejiga.setEstadoActual(1);
	}

}
