package esquema;

public class Usuario {
public static void main(String[] args) {
	Bridge abstraction=new Bridge(new ConcreteImplementationA());
	Client client=new Client();
	client.doItSomething(abstraction);
	abstraction.setImplementation(new ConcreteImplementationB());
	client.doItSomething(abstraction);
}
}
