package modelo.insectos;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import modelo.soporte.Alimento;

public class Guerrera implements Comportamiento {
	Hormiga hormiga;
	List<Integer> luchas;

	public Guerrera(Hormiga hormiga) {
		super();
		luchas=new ArrayList<>();
	}

	@Override
	public void actua() {
		hormiga.incrementaEdad(hormiga.getVida()/4);
		int tiempoMaximoLucha=100;
		luchas.add(new Random().nextInt(tiempoMaximoLucha));
	}

	@Override
	public Optional<List<Alimento>> getAlimentos() {
		return Optional.ofNullable(null);
	}

	@Override
	public boolean isGuerrera() {
		return true;
	}

}
