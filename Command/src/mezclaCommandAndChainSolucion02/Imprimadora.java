package mezclaCommandAndChainSolucion02;

public class Imprimadora extends BaseHandler {
	
	public void imprimar() {
		System.out.println("yo estoy imprimando");
	}
	
	//command & chain
	@Override
	public void handle(Coche request) {
		super.handle(request);
		imprimar();
	}
}
