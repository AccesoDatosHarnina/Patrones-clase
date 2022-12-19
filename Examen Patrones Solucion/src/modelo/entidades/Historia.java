package modelo.entidades;

import java.util.Observable;

public class Historia extends Observable {
	int historia = 0;
	boolean war = false;

	public void pasaHistoria() {
		historia++;
		if (historia % 100 == 0) {
			war = !war;
			setChanged();
			notifyObservers(war);
		}
	}

	public boolean isAcabada() {
		return historia == 310;
	}

	public boolean isEnGuerra() {
		return war;
	}
}
