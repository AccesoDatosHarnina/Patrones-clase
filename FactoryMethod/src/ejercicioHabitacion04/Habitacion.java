package ejercicioHabitacion04;

import java.util.ArrayList;

import org.junit.jupiter.api.extension.TestInstancePostProcessor;

public class Habitacion {
	private final int size = 4;
	ArrayList<Lado> lados=new ArrayList<>(size);
	ArrayList<LadoCreador> creadores;
	
	public Habitacion() {
		super();
		//sorteamos las habitaciones
		for (int i = 0; i < size; i++) {
			
		}
		//forzar un lado para que sea puerta
		lados.get(Utiles.getRandomInt(size));
	}
	
	private void cargarCreadores() {
		creadores.add(new MuroCreador());
		creadores.add(new PuertaCreador());
	}
}
