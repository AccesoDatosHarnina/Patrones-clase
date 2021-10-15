package ejercicio01;

public class Cliente {
	private String nombre;
	private byte edad;
	private Cuenta cuenta;

	public Cliente(String nombre, byte edad, Cuenta cuenta) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.cuenta = cuenta;
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

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", edad=" + edad + "]";
	}

}
