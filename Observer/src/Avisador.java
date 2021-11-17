import java.util.Observable;

public class Avisador extends Observable {
	int cantidad=0;
			
			
	public void engordaCantidad() {
		cantidad++;
		if(cantidad%1000==0) {
			cambio(cantidad);
		}
	}
	private void cambio(Object o){
		setChanged();
		notifyObservers(o);
	}
}
