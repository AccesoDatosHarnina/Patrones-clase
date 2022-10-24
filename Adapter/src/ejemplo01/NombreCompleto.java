package ejemplo01;

public class NombreCompleto {
	private String nombre;
	private  String apellidoUno;
	private  String apellidoDos="";
	
	public NombreCompleto(String nombre, String apellidoUno) {
		super();
		this.nombre = nombre;
		this.apellidoUno = apellidoUno;
	}

	public NombreCompleto(String nombre, String apellidoUno, String apellidoDos) {
		super();
		this.nombre = nombre;
		this.apellidoUno = apellidoUno;
		this.apellidoDos = apellidoDos;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidoUno() {
		return apellidoUno;
	}

	public String getApellidoDos() {
		return apellidoDos;
	}
	
	
	
}
