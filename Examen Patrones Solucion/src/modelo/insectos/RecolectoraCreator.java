package modelo.insectos;

public class RecolectoraCreator implements ComportamientoCreator {

	@Override
	public Comportamiento factoryMethod(Hormiga hormiga) {
		return new Recolectora(hormiga);
	}

}
