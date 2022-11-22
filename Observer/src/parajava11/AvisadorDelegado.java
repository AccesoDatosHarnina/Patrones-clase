package parajava11;

import java.beans.PropertyChangeSupport;

public class AvisadorDelegado  {
	// Observable
	private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);
	private String value="Lola";
	int cantidad=0;
	public void engordaCantidad() {
		int old=cantidad;
		cantidad++;
		if(cantidad%1000==0) {
			this.pcs.firePropertyChange("cantidad",old,cantidad);
		}
	}
	private String getValue() {
		return value;
	}
	
	void setValue(String value) {
		String old=this.value;
		this.value = value;
		this.pcs.firePropertyChange("value",old,value);
	}
	public void addPropertyChangeListener(Observador observador) {
		this.pcs.addPropertyChangeListener(observador);
		
	}
	
}
