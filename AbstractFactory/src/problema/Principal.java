package problema;

import problema.ConcreteFactory.JovenConcreteContractFactory;
import problema.abstractproduct.TarjetaCredito;
import problema.concreteProduct.TarjetaCreditoOro;

public class Principal {
	public static void main(String[] args) {
		Client client = new Client(new JovenConcreteContractFactory());
	}

}
