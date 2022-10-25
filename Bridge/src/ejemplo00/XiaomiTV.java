package ejemplo00;

public class XiaomiTV implements IModeloTV {

	@Override
	public void encender() {
		System.out.println("sending rf 1223");

	}

	@Override
	public void apagar() {
		System.out.println("sending rf 2122");

	}

}
