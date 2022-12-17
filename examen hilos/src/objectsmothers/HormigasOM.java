package objectsmothers;

import java.util.ArrayList;
import java.util.List;

import modelo.Hormiga;
import modelo.Hormiguero;

public class HormigasOM {
	
	public static List<Hormiga> getHormigasInicio(long cantidadHormigas, String adn,Hormiguero hormiguero) {
		ArrayList<Hormiga> hormigas=new ArrayList<>();
		for (int i = 0; i < cantidadHormigas; i++) {
			hormigas.add(new Hormiga(i,adn, hormiguero));
		}
		return hormigas;
	}
}
