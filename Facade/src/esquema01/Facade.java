package esquema01;

public class Facade {
	public void doSomething() {
		ComplicadaA complicadaA = new ComplicadaA();
		ComplicadaB complicadaB = new ComplicadaB();
		ComplicadaC complicadaC = new ComplicadaC();
		complicadaC.doC(complicadaA, complicadaB);
	}
}
