package esquema00;

public class ClienteNOfacade {
public void use() {
	ComplicadaA compA=new ComplicadaA();
	compA.doA();
	ComplicadaB complicadaB = new ComplicadaB();
	complicadaB.doB();
	ComplicadaC complicadaC = new ComplicadaC();
	complicadaC.doC(compA, complicadaB);
}
}
