package problema.concreteProduct;

import problema.abstractproduct.Cuenta;
import problema.abstractproduct.TarjetaCredito;
import problema.abstractproduct.TarjetaDebito;

public class CuentaOro extends Cuenta {

	public CuentaOro(TarjetaCredito tarjetaCredito, TarjetaDebito tarjetaDebito) {
		super(tarjetaCredito, tarjetaDebito);
		// TODO Auto-generated constructor stub
	}

	@Override
	public TarjetaCredito getTarjetaCredito() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TarjetaDebito getTarjetaDebito() {
		// TODO Auto-generated method stub
		return null;
	}

}
