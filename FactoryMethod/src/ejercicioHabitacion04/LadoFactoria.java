package ejercicioHabitacion04;

public class LadoFactoria {

	public Lado getProduct(LadoCreador ladoCreador) {
		return ladoCreador.factoryMethod();
	}
}
