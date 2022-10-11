package teoriamal00;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ConcreteCreatorATest {

	@Test
	void test() {
		ConcreteCreator creador=new ConcreteCreator();
		assertTrue(ConcreteProductB.class==creador.factoryMethod(2).getClass());
		assertTrue(creador.factoryMethod(2) instanceof ConcreteProductB);
	}

}
