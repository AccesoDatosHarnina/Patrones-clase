package ejemplo01;

public class Principal {
	public static void main(String[] args) throws InterruptedException {
		Avisador avisador = new Avisador();
		Observador observador=new Observador("Laura");
		Observador observador1=new Observador("Jose");
		Observador observador2=new Observador("ESteban");
		//asociar el observable con el observer
		avisador.addObserver(observador);
		avisador.addObserver(observador1);
		avisador.addObserver(observador2);
		do {
			avisador.engordaCantidad();
			Thread.sleep(1);
		}while(true);
	}
}
