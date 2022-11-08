package ejemplo;

public class Abstraccion {
	Cocinador cocinador;

	public Abstraccion(Cocinador cocinador) {
		super();
		this.cocinador = cocinador;
	}
	
	public void cocinarConVentilador() {
		cocinador.calienta();
		cocinador.enciendeVentilador();
	}
}
