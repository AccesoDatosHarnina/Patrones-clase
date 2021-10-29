package solucion03Enum;

public class Client {

	public void manage(Coche coche) {
		System.out.println(coche.getEstado());
		TreatmentType.treat(coche);
		System.out.println(coche.getEstado());
	}
}
