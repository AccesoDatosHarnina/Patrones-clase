package ejemplo00;

public class RemoteAdvance extends RemoteBasic {
	IModeloTVAdvance modeloTV;

	public RemoteAdvance(IModeloTVAdvance modeloTV) {
		super(modeloTV);
		this.modeloTV = modeloTV;
	}

	public void botonTres() {
		modeloTV.mute();
	}
}
