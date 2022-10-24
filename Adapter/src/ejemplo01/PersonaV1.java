package ejemplo01;

//esta clase no es propia
public class PersonaV1{
	private String nombre;
	private String Apellidos;
	private byte edad;

	public PersonaV1(String nombre, byte edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public byte getEdad() {
		return edad;
	}

	public void setEdad(byte edad) {
		this.edad = edad;
	}

	

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", edad=" + edad + "]";
	}

}
