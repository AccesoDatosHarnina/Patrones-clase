package solucion03;

public class Pintor extends BaseHandler{

	@Override
	public void handle(Coche coche) {
		System.out.println("coche pintado");
		super.handle(coche);
	}
}
