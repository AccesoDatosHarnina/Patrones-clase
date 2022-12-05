package ejemploSeres.solucion;

public class Anciano implements Comportamiento {

	private Ser ser;
	
	public Anciano(Ser ser) {
		super();
		this.ser = ser;
	}

	@Override
	public void alimentar(int cantidad) {
		System.out.println("soy un ser a secas");
		ser.recalcularEsperanzaDeVida(cantidad);

	}

}
