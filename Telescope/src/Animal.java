
public class Animal {
	//Obligatorio
	private String nombre;
	private String especie;
	//Opcionales
	private int numeroDeAlas;
	private int longitudCola;
	private int numeroPatas;
	
	//Telescope
	public Animal(String nombre, String especie) {
		super();
		this.nombre = nombre;
		this.especie = especie;
	}
	public Animal(String nombre, String especie,int numeroDeAlas) {
		this(nombre,especie);
		this.numeroDeAlas = numeroDeAlas;
	}
	public Animal(String nombre, String especie, int numeroDeAlas, int longitudCola) {
		this(nombre,especie,numeroDeAlas);
		this.longitudCola = longitudCola;
	}
	public Animal(String nombre, String especie, int numeroDeAlas, int longitudCola, int numeroPatas) {
		this(nombre,especie,numeroDeAlas,longitudCola);
		this.numeroPatas = numeroPatas;
	}
	
	
	
}
