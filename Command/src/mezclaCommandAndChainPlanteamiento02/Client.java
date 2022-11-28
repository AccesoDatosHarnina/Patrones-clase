package mezclaCommandAndChainPlanteamiento02;

public class Client {

	public void manage(Coche coche) {
		BaseHandler pulidora=new Pulidora();
		BaseHandler imprimadora=new Imprimadora();
		BaseHandler pintor=new Pintor();
		
		pulidora.setNext(imprimadora);
		imprimadora.setNext(pintor);
		
		pulidora.handle(coche);
	}
}
