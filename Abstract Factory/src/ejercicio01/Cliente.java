package ejercicio01;

public class Cliente {

	AbstractContratoFactory contratoFactory;

	public Cliente(AbstractContratoFactory contratoFactory) {
		super();
		this.contratoFactory = contratoFactory;
		AbstractCuenta cuenta=contratoFactory.createCuenta();
		AbstractTarjetaCredito tarjetaCredito=contratoFactory.createTarjetaCredito();
		AbstractTarjetaDebito tarjetaDebito=contratoFactory.createTarjetaDebito();
	}
	
	
}
