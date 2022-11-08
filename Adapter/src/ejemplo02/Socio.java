package ejemplo02;

import java.time.LocalDate;

public class Socio {
	public String name;
	public String apellidos;
	public int id;
	public LocalDate fechaAlta;

	public Socio(String name, String apellidos, int id, LocalDate fechaAlta) {
		super();
		this.name = name;
		this.apellidos = apellidos;
		this.id = id;
		this.fechaAlta = fechaAlta;
	}

}
