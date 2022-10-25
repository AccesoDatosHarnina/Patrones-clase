package ejemploordenador;

public abstract class Componente extends Ordenador {

	//El componente hereda de ordenador para que cada componente puede ser casteado
	@Override
	public abstract float calculateCost();

}
