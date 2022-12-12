package ejemplo00.bridge;

public class RemoteBasic {
	
	IModeloTV modeloTV;
	
	public RemoteBasic(IModeloTV modeloTV) {
		super();
		this.modeloTV = modeloTV;
	}

	public void setModeloTV(IModeloTV modeloTV) {
		this.modeloTV = modeloTV;
	}

	public void botonUno() {
		modeloTV.encender();
		modeloTV.setVolume(1);
	}

	public void botonDos() {
		modeloTV.apagar();
	}
}
