package esquema;


public class Usuario {
	public static void main(String[] args) {
		Client cliente=new Client(new Adapter());
		Data data=new Data();
		cliente.setDataService(data);		
	}
}
