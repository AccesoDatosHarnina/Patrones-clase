package ejemploSeres;

public class Menor extends Ser {
	private float factorDesarrollo;

	// Esto solo los menores
	@Override
	public void alimentar(int cantidad) {
		System.out.println("soy un menor");
		recalcularFactorDesarrollo(cantidad);
	}

	private void recalcularFactorDesarrollo(int cantidad) {
		// TODO Auto-generated method stub
		
	}

	
}
