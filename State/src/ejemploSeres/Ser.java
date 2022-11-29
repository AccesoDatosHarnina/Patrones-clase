package ejemploSeres;

public class Ser {
	private static final int vidaMax = 120;
	private static final int vidaMin = 0;
	private static final int edadAdulto = 18;
	protected static final int edadAnciano = 65;

	protected float esperanzaVida;
	protected int edad;
	protected int necesidadVital;
	

	public Ser() {
		super();
		esperanzaVida = calculaEsperanzaVida(vidaMin, vidaMax);
	}

	public Ser(Ser ser) {
		this.edad=ser.edad;
		this.esperanzaVida=ser.esperanzaVida;
		this.necesidadVital=ser.necesidadVital;
	}

	public float getEsperanzaVida() {
		return esperanzaVida;
	}

	public void setEsperanzaVida(float esperanzaVida) {
		this.esperanzaVida = esperanzaVida;
	}

	private int calculaEsperanzaVida(int minimo, int maximo) {
		return Utiles.dameNumero(maximo);
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean envejecer() {
		this.edad++;
		// TODO tengo que ver si un menor pasa a ser adulto o no
		// y para que pase de adulto a anciano
		return isAlive();
	}

	public boolean isAlive() {
		return this.edad <= this.esperanzaVida;
	}

	public void vivir(int sueldo) {
		this.alimentar(sueldo);
	}

	
	protected void recalcularEsperanzaDeVida(int sueldo) {
		// TODO recalculando
	}
	
	public void alimentar(int sueldo) {
		System.out.println("soy un ser a secas");
	}

	public boolean pasaAAnciano() {
		return edad==edadAnciano;
	}
	public boolean pasaAAdulto() {
		return edad==edadAdulto;
	}
}
