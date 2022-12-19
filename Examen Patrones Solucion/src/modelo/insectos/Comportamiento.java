package modelo.insectos;

import java.util.List;
import java.util.Optional;

import modelo.soporte.Alimento;

public interface Comportamiento {

	public void actua();
	public Optional<List<Alimento>> getAlimentos();
	public boolean isGuerrera();
}
