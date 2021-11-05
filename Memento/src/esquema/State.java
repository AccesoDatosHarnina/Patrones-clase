package esquema;

public class State {
	private int id;
	private String datos;

	public State(int id, String datos) {
		super();
		this.id = id;
		this.datos = datos;
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

	@Override
	public String toString() {
		return "State [id=" + id + ", datos=" + datos + "]";
	}

	public void setDatos(String datos) {
		this.datos = datos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datos == null) ? 0 : datos.hashCode());
		result = prime * result + id;
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
		return true;
	}

}
