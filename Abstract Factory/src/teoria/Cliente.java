package teoria;

public class Cliente {

	public Cliente(AbstractFactory factoria) {
		super();
		AbstractProductA productA = factoria.createProductA();
		AbstractProductB productB = factoria.createProductB();
	}
	
}
