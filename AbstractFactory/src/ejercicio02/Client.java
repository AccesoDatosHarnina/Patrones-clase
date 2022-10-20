package ejercicio02;

import ejercicio02.abstracto.Factory;
import ejercicio02.concrete1.Concrete1Factory;

public class Client {

	public static void main(String[] args) {
		Factory.setFactory(new Concrete1Factory());
		Factory factory=Factory.getFactory();
		System.out.println(factory.getProductA().view());
	}

}
