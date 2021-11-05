package esquema;

public class State implements Clonable<State> {
	private int id;
	private String datos;
	private SubState subState;

	public State(int id, String datos, SubState subState) {
		super();
		this.id = id;
		this.datos = datos;
		this.subState = subState;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDatos() {
		return datos;
	}



	public void setDatos(String datos) {
		this.datos = datos;
	}



	@Override
	public State clonar() throws CloneNotSupportedException {
		return new State(this.id, this.datos,this.subState.clonar());
	}

	public SubState getSubState() {
		return subState;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datos == null) ? 0 : datos.hashCode());
		result = prime * result + id;
		result = prime * result + ((subState == null) ? 0 : subState.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		State other = (State) obj;
		if (datos == null) {
			if (other.datos != null)
				return false;
		} else if (!datos.equals(other.datos))
			return false;
		if (id != other.id)
			return false;
		if (subState == null) {
			if (other.subState != null)
				return false;
		} else if (!subState.equals(other.subState))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "State [id=" + id + ", datos=" + datos + ", subState=" + subState + "]";
	}

}
