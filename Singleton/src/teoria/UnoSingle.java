package teoria;

public class UnoSingle {
	// Esta es la unica instancia de la clase
	private static UnoSingle INSTANCIA = new UnoSingle();
	public int valor=0;

	// El constructor es privado
	private UnoSingle() {
	}

	// Se accede a ella con un getter
	public static UnoSingle getInstancia() {
		return INSTANCIA;
	}

}
