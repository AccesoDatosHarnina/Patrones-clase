package ejemplillo01;

public class Ejemplo {
	public static void main(String[] args) {
		Abstraccion horno = new AbstraccionRefinada(new Horno());
		Abstraccion lena = new AbstraccionRefinada(new HornoDeLena());

		horno.cocinar();
		lena.cocinar();
	}
}
