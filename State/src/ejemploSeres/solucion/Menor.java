package ejemploSeres.solucion;

public class Menor implements Comportamiento {
	private float factorDesarrollo;

	// Esto solo los menores
	@Override
	public void alimentar(int cantidad) {
		System.out.println("soy un menor");
		recalcularFactorDesarrollo(cantidad);
	}

	boolean isViable() {
		//factor de desarrollo
		return true;
	}

	private void recalcularFactorDesarrollo(int cantidad) {
		// TODO Auto-generated method stub
		
	}

	
}
