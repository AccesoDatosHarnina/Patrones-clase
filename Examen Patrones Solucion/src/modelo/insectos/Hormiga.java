package modelo.insectos;

import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import modelo.entidades.Hormiguero;
import modelo.soporte.Alimento;

public abstract class Hormiga {

	private final int maxima = 50;
	protected int vida = new Random().nextInt(maxima) + 1;
	private int edad = 0;
	public long id;
	protected int incrementoVidaPorDefecto = 1;
	private boolean guerrera = false;
	// observer
	PropertyChangeSupport pcs;

	public Hormiga(long id, Hormiguero hormiguero) {
		super();
		this.id = id;
		pcs = new PropertyChangeSupport(this);
		pcs.addPropertyChangeListener(hormiguero);
	}

	public Hormiga(Hormiga hormiga, Hormiguero hormiguero) {
		this.vida = hormiga.getVida();
		edad = hormiga.getEdad();
		id=hormiga.getId();
		pcs = new PropertyChangeSupport(this);
		pcs.addPropertyChangeListener(hormiguero);
	}

	public boolean isGuerrera() {
		return guerrera;
	}

	public void setGuerrera(boolean guerrera) {
		this.guerrera = guerrera;
	}

	public int getVida() {
		return vida;
	}
	public int getEdad() {
		return edad;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public abstract void hacerEspecial();

	public void hacerTarea() {
		if (this.isAlive()) {
			hacerEspecial();
		} else {
			pcs.firePropertyChange("muerte", null, this);
		}

	};

	public boolean isAlive() {
		return vida > edad;
	}

	protected void incrementaEdad(int i) {
		this.edad += i;
	}

}
