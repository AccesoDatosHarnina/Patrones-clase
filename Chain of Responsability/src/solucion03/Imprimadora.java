package solucion03;

public class Imprimadora extends BaseHandler {
	@Override
	public void handle(Coche coche) {
		System.out.println("coche imrpimado");
		super.handle(coche);
	}
}
