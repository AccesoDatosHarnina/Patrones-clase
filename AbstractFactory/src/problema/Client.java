package problema;

public class Client {

	public CuentaJoven creaCuentaJoven(TarjetaCreditoJoven tarjetaCreditoJoven) {
		return new CuentaJoven(tarjetaCreditoJoven, new TarjetaDebitoOro());

	}
	public CuentaOro creaCuentaOro(TarjetaCreditoOro tarjetaCreditoOro) {
		return new CuentaOro(tarjetaCreditoOro, new TarjetaDebitoOro());
		
	}

}
