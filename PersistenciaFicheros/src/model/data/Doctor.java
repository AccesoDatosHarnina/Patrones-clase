package model.data;

import java.io.Serializable;

public class Doctor implements Serializable,base.Indicable<Integer> {
	private int id;
	private String nombre;
	private Lengua segunda;

	public Doctor(int id, String nombre, Lengua segunda) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.segunda = segunda;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public Lengua getSegunda() {
		return segunda;
	}


	@Override
	public String toString() {
		return nombre;
	}

	@Override
	public Integer getKey() {
		return id;
	}

	@Override
	public void setKey(Integer t) {
		this.id=t;
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((segunda == null) ? 0 : segunda.hashCode());
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
		Doctor other = (Doctor) obj;
		if (id != other.id)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (segunda != other.segunda)
			return false;
		return true;
	}
}
