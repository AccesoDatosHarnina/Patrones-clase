package ejemploordenador;


public class DiscoDuro extends Componente{

	private Ordenador actual;
	
	public DiscoDuro(Ordenador actual) {
		this.actual = actual;
	}

	@Override
	public float calculateCost() {
		System.out.println("mio actual Disco "+actual);
		return this.actual.calculateCost()+120;
	}

}
