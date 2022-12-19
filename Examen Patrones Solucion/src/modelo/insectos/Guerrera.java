package modelo.insectos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import modelo.entidades.Hormiguero;

public class Guerrera extends Hormiga {
	List<Integer> luchas;
	public Guerrera(long id, Hormiguero hormiguero) {
		super(id, hormiguero);
		luchas = new ArrayList<>();
	}
	public Guerrera(Hormiga hormiga,Hormiguero hormiguero) {
		super(hormiga,hormiguero);
	}
	public void hacerEspecial() {
		incrementaEdad(vida / 4);
		int tiempoMaximoLucha = 100;
		luchas.add(new Random().nextInt(tiempoMaximoLucha));
	}
}
