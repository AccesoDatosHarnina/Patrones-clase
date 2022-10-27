package model.data;

public enum Nacionalidad {

	Hispana(Lengua.castellano),Ingles(Lengua.ingles),Aleman(Lengua.aleman),Frances(Lengua.frances),Otra(Lengua.ingles);
	
	private Lengua lengua;

	private Nacionalidad(Lengua lengua) {
		this.lengua = lengua;
	}

	public Lengua getLengua() {
		return this.lengua;
	}
}
