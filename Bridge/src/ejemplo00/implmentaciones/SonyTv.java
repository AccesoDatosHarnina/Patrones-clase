package ejemplo00.implmentaciones;

import ejemplo00.bridge.IModeloTV;

public class SonyTv implements IModeloTV {

	@Override
	public void encender() {
		System.out.println("sending rf 3000");

	}

	@Override
	public void apagar() {
		System.out.println("sending rf 2000");

	}

	@Override
	public void setVolume(int volume) {
		System.out.println("sending rf 2000"+volume);
	}

}
