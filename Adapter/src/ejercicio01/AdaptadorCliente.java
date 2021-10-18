package ejercicio01;

public class AdaptadorCliente {

	private Cliente cliente;
	
	public AdaptadorCliente(Cliente cliente) {
		super();
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		//no respetamos leyes demeter
		return cliente.getNombre()+" "+cliente.getCuenta().getNumero()+" "+cliente.getCuenta().getSaldo();
	}
}
