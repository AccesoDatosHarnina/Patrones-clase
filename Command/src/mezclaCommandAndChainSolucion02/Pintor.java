package mezclaCommandAndChainSolucion02;

public class Pintor extends BaseHandler {
	//Command & Chain
	public void pintar() {
		System.out.println("estoy pintando");
	}

	@Override
	public void handle(Coche request) {
		super.handle(request);
		pintar();
	}
}
