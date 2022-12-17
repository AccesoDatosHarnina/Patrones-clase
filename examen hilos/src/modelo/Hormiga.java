package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import objectsmothers.AdnOM;
import objectsmothers.AlimentoOM;

public class Hormiga {
	private int vidaMax = 100, vidaMin = 80;
	private int vida = getVidaAleatoria(vidaMin, vidaMax);
	private int edad = 0;
	private String adn;

	public String getAdn() {
		return adn;
	}

	public static final int cantidadPoderNacimiento = 1000;
	private List<Alimento> recogidos;
	private Hormiguero hormiguero;
	public int id;

	private int alimentosRechazados = 0;
	private int alimentosOfrecidos = 0;

	public Hormiga(int id, String adnProgenitor, Hormiguero hormiguero) {
		super();
		this.adn = AdnOM.getNuevoAdn(adnProgenitor);
		this.hormiguero = hormiguero;
		recogidos = new ArrayList<Alimento>();
		this.id = id;
	}

	/**
	 * Compara si el alimento encontrado merece la pena ser recogido o no
	 * 
	 * @return
	 */
	private Alimento recoger() {
		alimentosOfrecidos++;
		Alimento encontrado = AlimentoOM.getAlimentoOM();
		float indiceSaludYPoderActual = getIndiceSalubridadPoderMedio();
		if (encontrado.getIndiceSalubridadPoder() >= indiceSaludYPoderActual / 2) {
			return encontrado;
		}
		alimentosRechazados++;
		return null;
	}

	/**
	 * calcula el indice actual de salubridad/poder que le permite recoger el
	 * alimento, o no y al final de su vida, crear un objeto de tipo IdoneidadADN
	 * 
	 * @return
	 */
	private float getIndiceSalubridadPoderMedio() {
		float sumatorio = 0;
		// java 8
		for (Alimento alimento : recogidos) {
			sumatorio += alimento.getIndiceSalubridadPoder();
		}
		if (recogidos.isEmpty())
			return 0;
		return sumatorio / recogidos.size();
	}

	private int getVidaAleatoria(int vidaMin, int vidaMax) {
		return new Random().nextInt(vidaMax - vidaMin) + vidaMin;
	}

	/**
	 * lleva el alimento recogido a la despensa
	 * 
	 * @param alimento
	 */
	private void acarrear(Alimento alimento) {
		hormiguero.descargar(alimento);
	}

	public boolean isAlive() {
		return vida > edad;
	}

	public float getIndiceAlimentosOfrecidosRechazados() {
		return (float) alimentosRechazados / alimentosOfrecidos;
	}

	public int getEdad() {
		return edad;
	}

	public List<Alimento> getRecogidos() {
		return recogidos;
	}

}
