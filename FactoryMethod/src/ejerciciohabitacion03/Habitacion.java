package ejerciciohabitacion03;

import java.util.ArrayList;

import org.junit.jupiter.api.extension.TestInstancePostProcessor;

public class Habitacion {
	private final int size = 4;
	ArrayList<Lado> lados=new ArrayList<>(size);
	
	public Habitacion() {
		super();
		//sorteamos las habitaciones
		for (int i = 0; i < size; i++) {
			lados.add(Tipo.getAleatorio());
		}
		//forzar un lado para que sea puerta
		lados.get(Utiles.getRandomInt(size));
		
	}
	
}
