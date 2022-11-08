package esquema;

public class Client {
	public void doItSomething(Bridge abstraction) {
		abstraction.featureA();
		ConcreteImplementationA c=new ConcreteImplementationA();
		//como llamar a featureA
		c.methodOne();
		c.methodFour();
	}
}
