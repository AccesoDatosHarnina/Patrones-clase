package modelo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

import objectsmothers.HormigasOM;

public class Hormiguero {
	private List<Hormiga> hormigas;
	private Map<Alimento, Integer> despensa;
	private List<IdoneidadADN> idoneidades;
	public void setIdoneidades(List<IdoneidadADN> idoneidades) {
		this.idoneidades = idoneidades;
	}


	private ExecutorService executorService;
	private int poblacionMaxima= 10000;
	private Criadero criadero;

	public Hormiguero() {
		super();
		hormigas = HormigasOM.getHormigasInicio(5, "AA", this);
		despensa = new HashMap<Alimento, Integer>();
	}

	public void descargar(Alimento alimento) {
		if (despensa.containsKey(alimento)) {
			Integer cantidad = despensa.get(alimento);
			despensa.put(alimento, ++cantidad);
		} else {
			despensa.put(alimento, 1);
		}
	}

	public List<Hormiga> getHormigas() {
		return hormigas;
	}

	public Map<Alimento, Integer> getDespensa() {
		return despensa;
	}

	
	public List<IdoneidadADN> getIdoneidades() {
		return idoneidades;
	}

	

}
