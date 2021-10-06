package teoria;

import org.junit.jupiter.api.Test;

class ClienteTest {

	@Test
	void testUseClon() {
		new Cliente().useClon(new ConcretePrototypeOneSub());
	}

}
