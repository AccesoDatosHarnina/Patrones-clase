package ejemplo00.cliente;

import ejemplo00.avanzado.IModeloTVAdvance;
import ejemplo00.avanzado.PhilipsTVAdvance;
import ejemplo00.avanzado.RemoteAdvance;
import ejemplo00.bridge.IModeloTV;
import ejemplo00.bridge.RemoteBasic;
import ejemplo00.implmentaciones.SonyTv;
import ejemplo00.implmentaciones.XiaomiTV;

public class Principal {

	public static void main(String[] args) {
		RemoteBasic mando=new RemoteBasic(new SonyTv());
		RemoteBasic mandoDos=new RemoteAdvance(new PhilipsTVAdvance());
		mando.botonUno();
		mando.botonDos();
		mando.setModeloTV(new XiaomiTV());
		mando.botonUno();
		mando.botonDos();
		mandoDos.botonUno();
		mando.setModeloTV(new PhilipsTVAdvance());
		RemoteAdvance remoteAdvance=new RemoteAdvance(new PhilipsTVAdvance());
		remoteAdvance.botonTres();
		RemoteAdvance remoteAdvance2=new RemoteAdvance((IModeloTVAdvance) new SonyTv());
		remoteAdvance2.botonTres();
		IModeloTV mitc=new SonyTv();
		mitc.encender();
		mitc.setVolume(1);
		
	}

}
