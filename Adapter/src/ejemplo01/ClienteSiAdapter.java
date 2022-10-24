package ejemplo01;

public class ClienteSiAdapter {
	Adaptador adaptador;

	public ClienteSiAdapter(Adaptador adaptador) {
		super();
		this.adaptador = adaptador;
	}

	public void hazAlgo() {
		System.out.println(adaptador.getNombre());

	}
}
