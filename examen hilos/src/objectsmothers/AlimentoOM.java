package objectsmothers;

import java.util.Random;

import modelo.Alimento;

public class AlimentoOM {
	public static Alimento getAlimentoOM() {
		return Alimento.values()[new Random().nextInt(Alimento.values().length)];
	}
}
