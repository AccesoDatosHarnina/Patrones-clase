package modelo;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

import objectsmothers.HormigasOM;

public class Criadero  implements Callable<List<Hormiga>>{
	private Map<Alimento, Integer> despensa;
	private List<Hormiga> hormigas;
	private List<IdoneidadADN> idoneidades;
	private Hormiguero hormiguero;
	
	public Criadero(Hormiguero hormiguero) {
		super();
		this.despensa = hormiguero.getDespensa();
		this.hormigas = hormiguero.getHormigas();
		this.idoneidades =  hormiguero.getIdoneidades();
		this.hormiguero = hormiguero;
	}

	/**
	 * elimina las hormigas muertas
	 */
	private void eliminar() {
		for (Iterator iterator = hormigas.iterator(); iterator.hasNext();) {
			Hormiga hormiga = (Hormiga) iterator.next();
			if (!hormiga.isAlive())
				iterator.remove();
		}
	}
	@Override
	public List<Hormiga> call() throws Exception {
		eliminar();
		List<Hormiga> criar = criar();
		vaciarDespensa();
		return criar;
	}
	/**
	 * genera una serie de hormigas basandose en la despensa
	 * @return
	 */
	private List<Hormiga> criar() {
		long sumatorio = 0;
		for (Map.Entry<Alimento, Integer> entry : despensa.entrySet()) {
			Alimento key = entry.getKey();
			int poder = key.getPoder();
			Integer val = entry.getValue();
			sumatorio += poder * val;
		}
		long cantidadHormigas = sumatorio / Hormiga.cantidadPoderNacimiento;
		IdoneidadADN idoneidadADN = obtenerMasIdoneo(idoneidades);
		return HormigasOM.getHormigasInicio(cantidadHormigas, idoneidadADN.getAdn(),hormiguero);
	}
	
	/**
	 * pone la despensa a cero
	 */
	private void vaciarDespensa() {
		for (Map.Entry<Alimento, Integer> entry : despensa.entrySet()) {
			entry.setValue(0);
		}
	}

	//java 8
	private IdoneidadADN obtenerMasIdoneo(List<IdoneidadADN> idoneidades) {
		//java 6
//		IdoneidadADN idoneo = idoneidades.get(0);
//		for (int i = 1; i < idoneidades.size(); i++) {
//			idoneo = idoneidades.get(i).isMejor(idoneo);
//		}
//		return idoneo;
		//java 8
		return idoneidades.stream()
				.sorted((a,b)->{return (int) (a.getIndiceSalubridadPoder()-b.getIndiceSalubridadPoder());})
				.findFirst()
				.get();
	}

	
	
	
	
	
	
	
	
	

}
