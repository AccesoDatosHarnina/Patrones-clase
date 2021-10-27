package ejemplo01;

public class ClaseA extends Carta {

	public ClaseA(String carta) {
		super();
		this.carta = carta;
		cartaCortesia();
	}

	@Override
	public void cartaCortesia() {

		if (!carta.equals("A")) {
			new ClaseB(carta);// Next Chain
		} else {
			System.out.print("Aqui tenemos " + carta);
		}

	}

}
