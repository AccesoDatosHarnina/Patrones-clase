package ejemplo01;

public class Persona {
	public Vejiga vejiga;
	private Pipiable strategy;

	public Persona() {
		super();
		vejiga=new Vejiga();
		vejiga.setEstadoActual(80);
	}

	void setStrategy(Pipiable strategy) {
		this.strategy = strategy;
	}
	public void hazPipi() {
		this.strategy.hazPipi(vejiga);
	}
}
