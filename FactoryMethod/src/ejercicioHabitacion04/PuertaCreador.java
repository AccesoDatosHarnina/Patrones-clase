package ejercicioHabitacion04;

public class PuertaCreador implements LadoCreador {

	@Override
	public Lado factoryMethod() {
		return new Puerta();
	}

}
