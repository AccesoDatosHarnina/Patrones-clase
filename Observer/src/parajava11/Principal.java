package parajava11;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		AvisadorDelegado avisador=new AvisadorDelegado();
		Observador observador=new Observador();
		// apuntarse al Observable
		avisador.addPropertyChangeListener(observador);
		Avisador normal=new Avisador();
		normal.pcs.addPropertyChangeListener(observador);
		avisador.setValue("Joaquin");
		do {
			avisador.engordaCantidad();
			Thread.sleep(1);
		}while(true);
	}

}
