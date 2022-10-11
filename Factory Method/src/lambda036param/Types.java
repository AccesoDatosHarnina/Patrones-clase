package lambda036param;

import java.util.function.Function;
import java.util.function.Supplier;

public enum Types {
	
	A((valor)->{return new ConcreteProductA(valor);}),
	B((valor)->{return new ConcreteProductB();}),
	C((valor)->{return new ConcreteProductC();});

	private Function<Integer,Product> function;
	private int valor;
	private Types(Function<Integer,Product> supplier) {
		this.function = supplier;
	}

	public Product factoryMethod(int valor) {
		return function.apply(valor);
	}
	
}
