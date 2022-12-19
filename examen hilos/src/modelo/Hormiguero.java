package modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

import objectsmothers.HormigasOM;

public class Hormiguero implements Runnable{
	private List<Hormiga> hormigas;
	private Map<Alimento, Integer> despensa;
	private List<IdoneidadADN> idoneidades;

	public void setIdoneidades(List<IdoneidadADN> idoneidades) {
		this.idoneidades = idoneidades;
	}

	private ExecutorService executorService;
	private int poblacionMaxima = 10000;
	private Criadero criadero;

	public Hormiguero() {
		super();
		hormigas = HormigasOM.getHormigasInicio(5, "AA", this);
		despensa = new HashMap<Alimento, Integer>();
	}

	@Override
	public void run() {
		idoneidades = new ArrayList();
		criadero = new Criadero(this);
		do {
			for (Hormiga hormiga : hormigas) {
				Future<IdoneidadADN> submit = executorService.submit(hormiga);
				try {
					idoneidades.add(submit.get());
				} catch (InterruptedException | ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			Future<List<Hormiga>> submit = executorService.submit(criadero);
			try {
				hormigas.addAll(submit.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while (hormigas.size() > poblacionMaxima);
	}

	public void descargar(Alimento alimento) {
		synchronized (despensa) {
			if (despensa.containsKey(alimento)) {
				Integer cantidad = despensa.get(alimento);
				despensa.put(alimento, ++cantidad);
			} else {
				despensa.put(alimento, 1);
			}
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
