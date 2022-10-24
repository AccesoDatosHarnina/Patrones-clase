package ejemplo01;

public class PersonaV2 {
	private NombreCompleto nombre;
	private byte edad;
	public PersonaV2(NombreCompleto nombre, byte edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	public NombreCompleto getNombre() {
		return nombre;
	}
	public byte getEdad() {
		return edad;
	}
	
}
