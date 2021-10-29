package ejemplo01Solucion;

public class ClasB implements Command {

	public void transforB() {
		System.out.println("transforma B");
	}

	@Override
	public void execute() {
		this.transforB();
		
	}
}
