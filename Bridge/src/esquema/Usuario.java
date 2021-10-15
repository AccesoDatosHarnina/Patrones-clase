package esquema;

public class Usuario {
public static void main(String[] args) {
	Abstraction abstraction=new Abstraction(new ConcreteImplementationA());
	Client client=new Client();
	client.doItSomething(abstraction);
	abstraction.setImplementation(new ConcreteImplementationB());
	client.doItSomething(abstraction);
}
}
