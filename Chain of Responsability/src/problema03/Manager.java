package problema03;

public class Manager {

	public void manage(Coche coche) {
		System.out.println(coche.getEstado());
		new Pulidora().pulir(coche);
		new Imprimadora().imrpimar(coche);
		new Pintor().pintar(coche);
		System.out.println(coche.getEstado());
	}
}
