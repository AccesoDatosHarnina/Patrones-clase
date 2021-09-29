package teroiabienactual02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Prueba {

	@Test
	void test() {
		//sin productManager
		Product product=Types.A.factoryMethod();
		assertTrue(product instanceof ConcreteProductA);
		//con manager
		ProductManager manager=new ProductManager();
		assertTrue(manager.getProduct(Types.A) instanceof ConcreteProductA);
	}

}
