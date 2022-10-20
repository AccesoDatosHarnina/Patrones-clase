package problema;

import problema.abstractfactory.AbstractContractFactory;
import problema.abstractproduct.Cuenta;
import problema.abstractproduct.TarjetaCredito;
import problema.abstractproduct.TarjetaDebito;

public class Client {
 AbstractContractFactory contractFactory;

public Client(AbstractContractFactory contractFactory) {
	super();
	this.contractFactory = contractFactory;
	Cuenta cuenta=this.contractFactory.createCuenta();
	TarjetaCredito tarjetaCredito=this.contractFactory.createTarjetaCredito();
	TarjetaDebito tarjetaDebito=this.contractFactory.createTarjetaDebito();
}
 
	

}
