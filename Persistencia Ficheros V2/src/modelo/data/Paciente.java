package modelo.data;

import java.io.Serializable;

import modelo.acceso.multi.Indicable;

public class Paciente implements Serializable, Indicable<String>{

	private String id;
	private String nombre;
	private Nacionalidad nacionalidad;
	
	public Paciente(String id, String nombre, Nacionalidad nacionalidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
	}

	public String getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public Nacionalidad getNacionalidad() {
		return nacionalidad;
	}
	
	
	@Override
	public String toString() {
		return nombre;
	}

	@Override
	public String getKey() {
		return this.id;
	}

	@Override
	public void setKey(String t) {
		this.id=t;
	}
}
