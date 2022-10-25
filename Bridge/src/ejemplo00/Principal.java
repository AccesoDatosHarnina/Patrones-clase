package ejemplo00;

public class Principal {

	public static void main(String[] args) {
		RemoteBasic mando=new RemoteBasic(new SonyTv());
		RemoteBasic mandoDos=new RemoteAdvance(new PhilipsTVAdvance());
		mando.botonUno();
		mando.botonDos();
		mando.setModeloTV(new XiaomiTV());
		mando.botonUno();
		mando.botonDos();
	}

}
