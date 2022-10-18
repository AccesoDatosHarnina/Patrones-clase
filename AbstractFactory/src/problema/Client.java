package problema;

public class Client {

	public static void main(String[] args) {
		// Como crear una cuenta Joven que lleva asociado
//		productos de tipo joven
		new CuentaJoven(new TarjetaCreditoJoven(), new TarjetaDebitoOro());
	}

}
