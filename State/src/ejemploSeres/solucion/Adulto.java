package ejemploSeres.solucion;

public class Adulto implements Comportamiento {
	private long ahorro;
	private Ser ser;

	public Adulto(Ser ser) {
		this.ser=ser;
	}
	// Esto solo los adultos
	// nv 100
	// ahorros 10
	// sueldo 80
	@Override
	public void alimentar(int cantidad) {
		System.out.println("soy adulto");
		int total = 0;
		if (ser.edad < ser.edadAnciano) {
			// sueldo es la cantidad
			int resto = cantidad - ser.necesidadVital;
			// resto sera -20
			this.ahorro += resto;
			// ahorros -10
			if (ahorro < 0) {
				total = (int) (ser.necesidadVital - ahorro);
				this.ahorro = 0;
			}
		} else {
			total = cantidad;
		}
		ser.recalcularEsperanzaDeVida(total);
	}

}
