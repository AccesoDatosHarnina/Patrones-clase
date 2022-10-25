package ejemplo00;

public class SonyTv implements IModeloTV {

	@Override
	public void encender() {
		System.out.println("sending rf 3000");

	}

	@Override
	public void apagar() {
		System.out.println("sending rf 2000");

	}

}
