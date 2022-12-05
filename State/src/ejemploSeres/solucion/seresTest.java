package ejemploSeres.solucion;

import org.junit.jupiter.api.Test;

class seresTest {

	@Test
	void test() {
		Ser ser=new Ser();
		System.out.println(ser.toString());
		System.out.println(ser.esperanzaVida);
		for (int i = 0; i < 120; i++) {
			ser.envejecer();
			ser.alimentar(1);
			
		}
		System.out.println(ser.toString());
		System.out.println(ser.esperanzaVida);
	}

}
