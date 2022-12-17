package modelo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.junit.jupiter.api.Test;

class HormigaTest {

	@Test
	void testHormiga() {
		Hormiguero hormiguero = new Hormiguero();
		ExecutorService executorService = Executors.newCachedThreadPool();
		for (int i = 0; i < 50; i++) {
			Hormiga hormiga = new Hormiga(1, "AA", hormiguero);
			List<Alimento> recogidos = hormiga.getRecogidos();
			int edad = hormiga.getEdad();
			float minimo = 0.6f;
			// debido a las limitaciones impuestas las veces que recoge
			// es menos del tercio de su edad
			System.out.println(hormiga.getIndiceAlimentosOfrecidosRechazados());
			assertTrue(hormiga.getIndiceAlimentosOfrecidosRechazados() > minimo);
			int indice = 40;
//			assertTrue(getIndiceSalubridadPoder()> indice);
		}
	}

}
