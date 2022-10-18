package teoria;

public class Client {
public static void main(String[] args) {
//	AbstactFactory factory;
	AbstractProductA productA;
	AbstractProductB productB;
	Client client=new Client();
//
	productA=client.createA(new ConcreteFactoryOne());
//	productB=factory.getProductB();
}

public AbstractProductA createA(AbstactFactory abstactFactory) {
	return abstactFactory.getProductA();
}
}
