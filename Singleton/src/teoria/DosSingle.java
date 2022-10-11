package teoria;


public class DosSingle {
	// Repetimos el ejercicio poniendo una propiedad no estatica
	private static DosSingle INSTANCIA = new DosSingle();
	private int cosa;

	public int getCosa() {
		return cosa;
	}

	public void setCosa(int cosa) {
		this.cosa = cosa;
	}

	// Constructor restringido
	private DosSingle() {

	}

	public static DosSingle getInstancia() {
		return INSTANCIA;
	}

	public void inicializa(int valor) {
		setCosa(valor);
	}
}
