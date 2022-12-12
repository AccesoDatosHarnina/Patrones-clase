package ejemplo00.implmentaciones;

import ejemplo00.bridge.IModeloTV;

public class XiaomiTV implements IModeloTV {

	@Override
	public void encender() {
		System.out.println("sending rf 1223");

	}

	@Override
	public void apagar() {
		System.out.println("sending rf 2122");

	}

	@Override
	public void setVolume(int volume) {
		System.out.println("sending rf 2122"+volume);
		
	}

}
