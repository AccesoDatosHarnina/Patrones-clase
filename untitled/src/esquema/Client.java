package esquema;

public class Client {

	ClientInterface adaptador;
	
	
	public Client(ClientInterface adaptador) {
		super();
		this.adaptador = adaptador;
	}


	public void setDataService(Data data) {
		adaptador.method(data);
	}
}
