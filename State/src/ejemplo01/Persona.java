package ejemplo01;

public class Persona {
	public int vejiga = 100;
	public Pipiable pipiable;

	
	public Persona(Pipiable pipiable) {
		super();
		this.pipiable=pipiable;
		this.pipiable.setPersona(this);
	}

	public void setState(Pipiable pipiable) {
		this.pipiable=pipiable;
	}

	int getVejiga() {
		return vejiga;
	}

	void setVejiga(int vejiga) {
		this.vejiga = vejiga;
	}

	public void hazPipi() {
		pipiable.hazPipi();
	}
}
