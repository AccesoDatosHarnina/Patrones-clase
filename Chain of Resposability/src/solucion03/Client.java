package solucion03;

public class Client {

	public void manage(Coche coche) {
		Pulidora pulidora=new Pulidora();
		Imprimadora imprimadora=new Imprimadora();
		Pintor pintor=new Pintor();
		
		pulidora.setNext(imprimadora);
		imprimadora.setNext(pintor);
		pulidora.handle(coche);
	}
}
