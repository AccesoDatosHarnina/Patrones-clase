package ejercicioHabitacion04;

import java.util.ArrayList;

import org.junit.jupiter.api.extension.TestInstancePostProcessor;

public class Habitacion {
	private final int size = 4;
	ArrayList<Lado> lados=new ArrayList<>(size);
	ArrayList<LadoCreador> creadores;
	
	public Habitacion() {
		super();
		cargarCreadores();
		//sorteamos las habitaciones
		for (int i = 0; i < size-1; i++) {
			lados.add((Lado) creadores.get(Utiles.getRandomInt(size)).factoryMethod());
		}
		//forzar un lado para que sea puerta
		lados.add((Lado) new PuertaCreador().factoryMethod());
	}
	
	private void cargarCreadores() {
		creadores.add(new MuroCreador());
		creadores.add(new PuertaCreador());
	}
}
