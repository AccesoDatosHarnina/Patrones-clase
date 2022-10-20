package problema.concreteProduct;

import problema.abstractproduct.Cuenta;
import problema.abstractproduct.TarjetaCredito;
import problema.abstractproduct.TarjetaDebito;

public class CuentaJoven extends Cuenta{

	public CuentaJoven(TarjetaCredito tarjetaCredito, TarjetaDebito tarjetaDebito) {
		super(tarjetaCredito, tarjetaDebito);
		
	}

	@Override
	public TarjetaCredito getTarjetaCredito() {
		return tarjetaCredito;
	}

	@Override
	public TarjetaDebito getTarjetaDebito() {
		return tarjetaDebito;
	}

}
