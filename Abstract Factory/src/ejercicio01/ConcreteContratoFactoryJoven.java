package ejercicio01;

public class ConcreteContratoFactoryJoven implements AbstractContratoFactory {

	@Override
	public AbstractCuenta createCuenta() {
		return new ConcreteCuentaJoven();
	}

	@Override
	public AbstractTarjetaCredito createTarjetaCredito() {
		return new ConcreteTarjetaCreditoJoven();
	}

	@Override
	public AbstractTarjetaDebito createTarjetaDebito() {
		return new ConcreteTarjetaDebitoJoven();
	}

}
