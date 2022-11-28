package solucion03;

public class Pulidora extends BaseHandler{
	
	@Override
	public void handle(Coche coche) {
		System.out.println("coche pulido");
		super.handle(coche);
	}
}
