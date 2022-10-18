package teoria;

public class Client {
public static void main(String[] args) {
	AbstactFactory factory;
	AbstractProductA productA;
	AbstractProductB productB;
	
//
	factory=new ConcreteFactoryOne();
	productA=factory.getProductA();
	productB=factory.getProductB();
}
}
