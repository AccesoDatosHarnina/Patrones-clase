package modelo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class CriaderoTest {

	@Test
	void testCriaderoDespensa() {
		//Aqui probamos que se cria el numero correcto de hormigas dependiendo de la despensa
		Hormiguero hormiguero=new Hormiguero();
		//pata, poder de cien, cantidad para criar hormiga 1000
		//con esto puede crear solo una hormiga
		int anterior=hormiguero.getHormigas().size();
		hormiguero.getDespensa().put(Alimento.pata, 10);		
		Criadero criadero=new Criadero(hormiguero);
		//crear las hormigas (solo hay alimento para 1)
		int posterior=hormiguero.getHormigas().size();
		assertEquals(anterior+1, posterior);
		//despues de criada la despensa esta vacia
		assertEquals(0,hormiguero.getDespensa().get(Alimento.pata));
	}
	
	@Test
	void testCriaderoADN() {
		Hormiguero hormiguero=new Hormiguero();
		//pata, poder de cien, cantidad para criar hormiga 1000
		//con esto puede crear solo una hormiga
		int anterior=hormiguero.getHormigas().size();
		hormiguero.getDespensa().put(Alimento.pata, 10);
		List<IdoneidadADN> idoneidades=new ArrayList<IdoneidadADN>();
		String adnInicial = "BB";
		idoneidades.add(new IdoneidadADN(adnInicial, 100f));
		hormiguero.setIdoneidades(idoneidades);
		Criadero criadero=new Criadero(hormiguero);
		//crear las hormigas (solo hay alimento para 1)
		//obten la hormiga creada y comprueba su adn
//		assertTrue(hormigaCreada.getAdn().startsWith(adnInicial));
	}

}
