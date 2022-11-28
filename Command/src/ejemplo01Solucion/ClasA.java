package ejemplo01Solucion;

public class ClasA implements Command {

	public void transformaA() {
		System.out.println("transforma A");
	}

	@Override
	public void execute() {
		this.transformaA();

	}
}
