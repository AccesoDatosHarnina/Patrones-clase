package modelo.soporte;

import java.util.ArrayList;

import modelo.insectos.Hormiga;

public class HormigaDataAdapter {
	
	//Es posible hacerlo no estatico
	public static HormigaData convert(Hormiga hormiga) {
		return new HormigaData(hormiga.getAlimentos().orElse(new ArrayList<Alimento>()), hormiga.getVida(), hormiga.getId());
	}
}
