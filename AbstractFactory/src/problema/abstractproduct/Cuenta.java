package problema.abstractproduct;

public abstract class Cuenta {
	public TarjetaCredito tarjetaCredito;
	public TarjetaDebito tarjetaDebito;
	
	public Cuenta(TarjetaCredito tarjetaCredito, TarjetaDebito tarjetaDebito) {
		super();
		this.tarjetaCredito = tarjetaCredito;
		this.tarjetaDebito = tarjetaDebito;
	}
	
	public abstract TarjetaCredito getTarjetaCredito();
	public abstract TarjetaDebito getTarjetaDebito();
	
}
