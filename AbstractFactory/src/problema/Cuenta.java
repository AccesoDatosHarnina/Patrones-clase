package problema;

public abstract class Cuenta {
	public TarjetaCredito tarjetaCredito;
	public TarjetaDebito tarjetaDebito;
	
	public Cuenta(TarjetaCredito tarjetaCredito, TarjetaDebito tarjetaDebito) {
		super();
		this.tarjetaCredito = tarjetaCredito;
		this.tarjetaDebito = tarjetaDebito;
	}
	
}
