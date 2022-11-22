package ejemplo01;
import java.util.Observable;

public class Avisador extends Observable{
	int cantidad=0;
	
	public void engordaCantidad() {
		cantidad++;
		if(cantidad%1000==0) {
			cambio(cantidad);
		}
	}
	private void cambio(Object o){
		//lo primero es decir que hay un cambio avisable pendiente
		setChanged();
		notifyObservers(o);
	}
}
