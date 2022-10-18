package problema;

public class Principal {
	public static void main(String[] args) {
		Client client = new Client();
		TarjetaCredito tarjetaCredito = new TarjetaCreditoOro();
		if (tarjetaCredito instanceof TarjetaCreditoOro)
			client.creaCuentaOro((TarjetaCreditoOro) tarjetaCredito);
	}

}
