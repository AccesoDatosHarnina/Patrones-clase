package modelo.entidades;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import modelo.insectos.*;
import modelo.soporte.*;

public class Hormiguero implements PropertyChangeListener,Observer {
	Statistics statistics;
	public final int cantidadHormigasTotal = 30;
	public final int cantidadHormigasGuerreras = 15;

	private boolean atacada = false;
	private boolean tareaAcabada = false;

	private List<Hormiga> hormigas;
	private static long id = 1;

	public Hormiguero() {
		super();
		hormigas = new ArrayList<Hormiga>();
		statistics = new Statistics();
	}

	public void funciona() {
		Historia historia = new Historia();
		historia.addObserver(this);
		int guerreras = 0;
		do {
			historia.pasaHistoria();
			trabajar();
			guerreras = 0;
			if (historia.isEnGuerra()) {
				guerreras = cantidadHormigasGuerreras - contarHormigasGuerreras();
			}
			crearHormigas(guerreras);
		}while(!historia.isAcabada());
//        System.out.println(statistics.getCurrentMediaAlimento());
//        System.out.println(statistics.getCurrentIndiceGlobal());
	}

	private void trabajar() {
		for (int i = 0; i < hormigas.size(); i++) {
			Hormiga hormiga = hormigas.get(i);
			hormiga.hacerTarea();
		}
	}

	public List<Hormiga> getHormigas() {
		return hormigas;
	}

	public void setHormigas(List<Hormiga> hormigas) {
		this.hormigas = hormigas;
	}

	private void convertirHormigasGuerra(int i) {
		int contador = 0;
		for (int j = 0; j < cantidadHormigasGuerreras; j++) {
			hormigas.get(j).setGuerrera(true);
			contador++;
		}
		System.out.println("hormigas  guerreras convertidas " + contador);
	}

	private void convertirHormigasPaz() {
		int contador = 0;
		for (Hormiga hormiga : hormigas) {
			if (hormiga.isGuerrera()) {
				hormiga.setGuerrera(false);
				contador++;
			}
		}
		System.out.println("hormigas  convertidas a la paz " + contador);
	}

	private int contarHormigasGuerreras() {
		int contador = 0;
		for (Hormiga hormiga : hormigas) {
			if (hormiga.isGuerrera())
				contador++;
		}
		return contador;
	}

	private void crearHormigas(int guerreras) {
		int contador = 0;
		for (int i = hormigas.size(); i < cantidadHormigasTotal; i++) {
			Hormiga hormiga = new Hormiga(id++, this);
			if (guerreras-- > 0) {
				hormiga.setGuerrera(true);
			}
			hormigas.add(hormiga);
			contador++;
		}
	}

	private void setTareaAcabada(boolean tareaAcabada) {
		this.tareaAcabada = tareaAcabada;
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		PropertyChangeEvent evt2 = evt;
		Hormiga hormiga = (Hormiga) evt.getNewValue();
		statistics.addData(HormigaDataAdapter.convert(hormiga));
		hormigas.remove(hormiga);
	}

	@Override
	public void update(Observable o, Object arg) {
		Boolean respuesta=(Boolean) arg;
		if(respuesta) {
			 convertirHormigasGuerra(cantidadHormigasGuerreras - contarHormigasGuerreras());
		}else {
			  convertirHormigasPaz();
		}
	}

}
