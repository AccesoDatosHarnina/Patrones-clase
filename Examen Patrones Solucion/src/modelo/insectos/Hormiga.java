package modelo.insectos;

import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import modelo.entidades.Hormiguero;
import modelo.soporte.Alimento;
import modelo.soporte.HormigaDataAdapter;

public class Hormiga {

	private final int maxima = 50;
	protected int vida = new Random().nextInt(maxima) + 1;
	private int edad = 0;
	public long id;
	protected int incrementoVidaPorDefecto = 1;
	// observer
	PropertyChangeSupport pcs;
	// State
	Comportamiento comportamiento;

	public Hormiga(long id, Hormiguero hormiguero) {
		super();
		this.id = id;
		pcs = new PropertyChangeSupport(this);
		pcs.addPropertyChangeListener(hormiguero);
		comportamiento = new RecolectoraCreator().factoryMethod(this);
	}

	public boolean isGuerrera() {
		return comportamiento.isGuerrera();
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
	
	public void setComportamiento(ComportamientoCreator cp) {
		comportamiento=cp.factoryMethod(this);
	}

	public void hacerTarea() {
		if (this.isAlive()) {
			comportamiento.actua();
		} else {
			pcs.firePropertyChange("muerte", HormigaDataAdapter.convert(this), this);
		}

	};

	public boolean isAlive() {
		return vida > edad;
	}

	protected void incrementaEdad(int i) {
		this.edad += i;
	}

	public Optional<List<Alimento>> getAlimentos() {
		return comportamiento.getAlimentos();
	}

}
