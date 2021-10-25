package esquema;

public class Client {
Context context;

public Client() {
	super();
	//ahora si uso las implentaciones concretas
	context=new Context(new UniqueState(), new RepeatingState()); 
}

}
