package mezclaCommandAndChainPlanteamiento02;

public class Imprimadora extends BaseHandler {
	
	public void imprimar() {
		System.out.println("yo estoy imprimando");
	}
	
	@Override
	public void handle(Coche request) {
		super.handle(request);
		System.out.println("yo estoy imprimando");
	}
}
