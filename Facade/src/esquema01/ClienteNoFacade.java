package esquema01;

public class ClienteNoFacade {
	public void use() {
		ComplicadaA a = new ComplicadaA();
		ComplicadaB b = new ComplicadaB();
		ComplicadaC c = new ComplicadaC();
		c.doC(a, b);
	}
}
