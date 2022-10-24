package ejercicio01;

public class AdaptadorPersona {

	private Persona cliente;
	
	public AdaptadorPersona(Persona cliente) {
		super();
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		//no respetamos leyes demeter
		return cliente.getNombre()+" "+cliente.getCuenta().getNumero()+" "+cliente.getCuenta().getSaldo();
	}
}
