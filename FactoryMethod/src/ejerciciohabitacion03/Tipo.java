package ejerciciohabitacion03;

import java.util.Random;
import java.util.function.Supplier;

import org.junit.jupiter.api.extension.TestInstancePostProcessor;

public enum Tipo {
	Muro(() -> {
		return new Muro();
	}), Puerta(() -> {
		return new Puerta();
	}), Ventana(() -> {
		return new Ventana();
	});

	private Supplier<Lado> supplier;

	private Tipo(Supplier<Lado> supplier) {
		this.supplier = supplier;
	}

	public Supplier<Lado> getSupplier() {
		return supplier;
	}

	public static Lado getAleatorio() {
		int length = Tipo.values().length;
		int nextInt = Utiles.getRandomInt(length);
		return getLado(Tipo.values()[nextInt]);

	}

	private static Lado getLado(Tipo tipo) {
		return tipo.getSupplier().get();
	}
}
