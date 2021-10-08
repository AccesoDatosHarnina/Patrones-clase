package ejercicio01;

public interface AbstractContratoFactory {
	public AbstractCuenta createCuenta();
	public AbstractTarjetaCredito createTarjetaCredito();
	public AbstractTarjetaDebito createTarjetaDebito();
}
