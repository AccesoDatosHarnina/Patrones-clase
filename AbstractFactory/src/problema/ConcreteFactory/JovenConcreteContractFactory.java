package problema.ConcreteFactory;

import problema.abstractfactory.AbstractContractFactory;
import problema.abstractproduct.Cuenta;
import problema.abstractproduct.TarjetaCredito;
import problema.abstractproduct.TarjetaDebito;
import problema.concreteProduct.CuentaJoven;
import problema.concreteProduct.TarjetaCreditoJoven;
import problema.concreteProduct.TarjetaDebitoJoven;

public class JovenConcreteContractFactory implements AbstractContractFactory{

	Cuenta cuenta=new CuentaJoven(new TarjetaCreditoJoven(),new TarjetaDebitoJoven());

	@Override
	public Cuenta createCuenta() {
		return cuenta;
	}

	@Override
	public TarjetaCredito createTarjetaCredito() {
		return cuenta.getTarjetaCredito();
	}

	@Override
	public TarjetaDebito createTarjetaDebito() {
		return cuenta.getTarjetaDebito();
	}
		
		
	
}
