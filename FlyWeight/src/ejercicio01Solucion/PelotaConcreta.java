package ejercicio01Solucion;

//UniqueState
public class PelotaConcreta {
	//una serie de propiedades que dependeran de la pelota concreto
	private int x = 0, y = 0;
	private PelotaFlyWeight pelotaFlyWeight;
	public PelotaConcreta(PelotaFlyWeight pelotaFlyWeight) {
		super();
		this.pelotaFlyWeight = pelotaFlyWeight;
	}
	
	
}
