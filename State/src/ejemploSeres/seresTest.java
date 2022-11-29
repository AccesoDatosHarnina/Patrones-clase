package ejemploSeres;

import org.junit.jupiter.api.Test;

class seresTest {

	@Test
	void test() {
		Ser ser=new Menor();
		System.out.println(ser.toString());
		System.out.println(ser.esperanzaVida);
		for (int i = 0; i < 120; i++) {
			ser.envejecer();
			ser.alimentar(1);
			//SONDEO o POLLING preguntar todo el tiempo si ha
			//habido un cambio
			if(ser.pasaAAdulto()) {
				ser=new Adulto(ser);
			}
			if(ser.pasaAAnciano()){
				ser=new Ser(ser);
			}
		}
		System.out.println(ser.toString());
		System.out.println(ser.esperanzaVida);
	}

}
