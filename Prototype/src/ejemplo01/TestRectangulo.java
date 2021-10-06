package ejemplo01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestRectangulo {

	@Test
	void test() throws CloneNotSupportedException {
		Rectangulo rectangulo = new Rectangulo(15);
		Rectangulo copia=rectangulo.clone();
		assertEquals(copia.getLado(), rectangulo.getLado());
		copia.setLado(19);
		assertNotEquals(copia.getLado(), rectangulo.getLado());
	}

}
