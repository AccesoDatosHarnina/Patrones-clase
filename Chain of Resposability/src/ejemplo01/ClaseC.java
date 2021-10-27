package ejemplo01;

public class ClaseC extends Carta {

	public ClaseC(String carta) {
		this.carta = carta;
		cartaCortesia();
	}

	@Override
	public void cartaCortesia() {
		if (!carta.equals("C")) {
			new ClaseD(carta);// Next Chain
		} else {
			System.out.print("Aqui tenemos " + carta);
		}


	}

}
