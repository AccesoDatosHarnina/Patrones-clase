package teoria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonaConstruccionTest {

	@Test
	void test() {
		PersonaConstruccion personaConstruccion=
				new PersonaConstruccion.Builder(1,"Luis","SanFelipe")
					.phone("4")
					.color("verde")
					.build();
		PersonaConstruccion personaConstruccion2=
				new PersonaConstruccion.Builder(1,"Luis","SanFelipe")
					.color("verde")
					.build();
	}

}
