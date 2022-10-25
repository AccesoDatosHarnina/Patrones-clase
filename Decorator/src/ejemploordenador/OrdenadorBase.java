package ejemploordenador;

public class OrdenadorBase extends Ordenador {
	// Pero aqui no existe la propiedad Ordenaador
	@Override
	public float calculateCost() {
		System.out.println("mio actual base");
		return 0;
	}

}
