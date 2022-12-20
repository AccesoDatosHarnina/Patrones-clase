package modelo.insectos;

public class GuerreraCreator implements ComportamientoCreator {

	@Override
	public Comportamiento factoryMethod(Hormiga hormiga) {
		return new Guerrera(hormiga);
	}

}
