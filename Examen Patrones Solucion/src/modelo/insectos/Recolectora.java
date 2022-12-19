package modelo.insectos;

import java.util.ArrayList;
import java.util.List;

import modelo.entidades.Hormiguero;
import modelo.soporte.Alimento;

public class Recolectora extends Hormiga {
	List<Alimento> alimentos;
	public Recolectora(long id, Hormiguero hormiguero) {
		super(id, hormiguero);
		alimentos = new ArrayList();
	}
	public List<Alimento> getAlimentos() {
		return alimentos;
	}

	public void setAlimentos(List<Alimento> alimentos) {
		this.alimentos = alimentos;
	}
	public void hacerEspecial() {
		incrementaEdad(incrementoVidaPorDefecto);
		alimentos.add(Alimento.getRandomAlimento());
		
	}
}
