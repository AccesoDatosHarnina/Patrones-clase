package ejemploSeres;

public class Adulto extends Ser {
	private long ahorro;

	public Adulto(Ser ser) {
		super(ser);
	}
	// Esto solo los adultos
	// nv 100
	// ahorros 10
	// sueldo 80
	@Override
	public void alimentar(int cantidad) {
		System.out.println("soy adulto");
//		int total = 0;
//		if (edad < edadAnciano) {
//			// sueldo es la cantidad
//			int resto = cantidad - necesidadVital;
//			// resto sera -20
//			this.ahorro += resto;
//			// ahorros -10
//			if (ahorro < 0) {
//				total = (int) (necesidadVital - ahorro);
//				this.ahorro = 0;
//			}
//		} else {
//			total = cantidad;
//		}
//		recalcularEsperanzaDeVida(total);
	}

}
