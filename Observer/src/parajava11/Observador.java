package parajava11;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Observador implements PropertyChangeListener {

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		System.out.println("ha cambio en "+evt.getPropertyName());
		System.out.println("el antiguo "+evt.getOldValue());
		System.out.println("ahora tiene valor "+evt.getNewValue());
	}

}
