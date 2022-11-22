package ejemplo01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectanguloTest {

	@Test
	void test() {
		Rectangulo uno=new Rectangulo(3);
		try {
			Rectangulo clone = uno.clone();
			assertEquals(uno.getLado(), clone.getLado());
			assertNotEquals(uno, clone);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}

}
