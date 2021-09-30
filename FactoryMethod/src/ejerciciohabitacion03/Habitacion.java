package ejerciciohabitacion03;

import java.util.ArrayList;

public class Habitacion {
	private final int size = 4;
	ArrayList<Lado> lados=new ArrayList<>(size);
	
	public Habitacion() {
		super();
		for (int i = 0; i < size; i++) {
			lados.add(Tipo.getAleatorio());
		}
		
	}
	
}
