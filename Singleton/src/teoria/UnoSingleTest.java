package teoria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UnoSingleTest {

	@Test
	void test() {
		//no puedo crear un objeto
//		UnoSingle instance=new UnoSingle();
		UnoSingle instance=UnoSingle.getInstancia();
		instance.valor++;
		UnoSingle other=UnoSingle.getInstancia();
		System.out.println(other.valor);
	}

}
