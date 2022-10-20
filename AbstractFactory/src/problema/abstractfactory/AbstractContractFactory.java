package problema.abstractfactory;

import problema.abstractproduct.Cuenta;
import problema.abstractproduct.TarjetaCredito;
import problema.abstractproduct.TarjetaDebito;

public interface AbstractContractFactory {
	public Cuenta createCuenta();

	public TarjetaCredito createTarjetaCredito();

	public TarjetaDebito createTarjetaDebito();
}
