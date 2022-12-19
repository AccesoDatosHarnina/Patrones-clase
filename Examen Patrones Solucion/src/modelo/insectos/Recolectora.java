package modelo.insectos;

import java.util.List;
import java.util.Optional;

import modelo.soporte.Alimento;

public class Recolectora implements Comportamiento {
	Hormiga hormiga;
	List<Alimento> alimentos;

	public Recolectora(Hormiga hormiga) {
		super();
		this.hormiga = hormiga;
	}

	@Override
	public void actua() {
		alimentos.add(Alimento.getRandomAlimento());
		hormiga.incrementaEdad(hormiga.incrementoVidaPorDefecto);
	}

	@Override
	public Optional<List<Alimento>> getAlimentos() {
		return Optional.of(alimentos);
	}

	@Override
	public boolean isGuerrera() {
		return false;
	}

}
