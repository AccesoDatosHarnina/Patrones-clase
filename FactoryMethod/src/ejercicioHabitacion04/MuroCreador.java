package ejercicioHabitacion04;

public class MuroCreador implements LadoCreador {

	@Override
	public Lado factoryMethod() {
		return new Muro();
	}

}
