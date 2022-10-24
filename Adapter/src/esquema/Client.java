package esquema;

public class Client {

	ClientInterface adaptador;
	Service service=new Service();
	
	public Client(ClientInterface adaptador) {
		super();
		this.adaptador = adaptador;
	}


	public void setDataService(Data data) {
		adaptador.method(data);
	}
}
