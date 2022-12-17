package modelo;

public enum Alimento {
	hoja(100,10),
	pata(100,100),
	pan(50,50),
	azucar(10,60),
	plastico(1,1);
	private int salubridad;
	private int poder;

	private Alimento(int salubridad, int poder) {
		this.salubridad = salubridad;
		this.poder = poder;
	}

	public float getIndiceSalubridadPoder() {
		return (float)poder*(salubridad/100);
	}

	public int getPoder() {
		return poder;
	}
	
	@Override
	public String toString() {
		return name();
	}
	
}
