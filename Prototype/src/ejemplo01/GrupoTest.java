package ejemplo01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GrupoTest {

	@Test
	void testClone() {
		Grupo grupo=new Grupo("Norberto");
		try {
			Grupo clone = grupo.clone();
			assertEquals(clone.getNombre(),grupo.getNombre());
			assertNotEquals(grupo.getMiREc(), clone.getMiREc());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
