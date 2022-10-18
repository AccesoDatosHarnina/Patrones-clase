package ejercicio01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonaTest {

	@Test
	void test() {
		Persona persona=new Persona(1,"luis","gonsalves");
		persona.setPhone("1");
		PersonaTelescope personaTelescope=new PersonaTelescope(1,"luis","gonsalves");
		PersonaTelescope personaTelescope2=
				new PersonaTelescope(1,"luis","gonsalves","55");
		PersonaTelescope personaTelescope3=
				new PersonaTelescope(1,"luis","gonsalves","66","verde");
	}

}
