package mezclaCommandAndChainPlanteamiento02;

public class Pintor extends BaseHandler {
	public void pintar() {
		System.out.println("estoy pintando");
	}

	@Override
	public void handle(Coche request) {
		super.handle(request);
		System.out.println("estoy pintando");
	}
}
