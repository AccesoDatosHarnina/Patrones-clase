package ejercicio02;

import ejercicio02.abstracto.Factory;
import ejercicio02.concrete1.Concrete1Factory;
import ejercicio02.concrete2.Concrete2Factory;

public class Client {
	public static void main(String[] args) {
		Factory.setFactory(new Concrete1Factory());
		Factory carolina = Factory.getFactory();
		System.out.println( carolina.getProductA());
		Factory.setFactory(new Concrete2Factory());
		carolina = Factory.getFactory();
		System.out.println( carolina.getProductA());
	}
}
