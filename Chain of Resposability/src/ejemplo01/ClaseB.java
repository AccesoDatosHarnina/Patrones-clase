package ejemplo01;

public class ClaseB extends Carta {

	public ClaseB(String carta){
        this.carta = carta;
        cartaCortesia();
}
	
	@Override
	public void cartaCortesia() {

		if (!carta.equals("B")) {
			new ClaseC(carta);// Next Chain
		} else {
			System.out.print("Aqui tenemos " + carta);
		}

	}

}
