package ejemplo01;

public class ClaseD extends Carta{

	
	public ClaseD(String carta) {
		this.carta = carta;
		cartaCortesia();
	}

	@Override
	public void cartaCortesia() {
		if (carta.equals("D")) {
			System.out.print("Consulte de nuevo desde el ppio!!");
		}
	}

}
