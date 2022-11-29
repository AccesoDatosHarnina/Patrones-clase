package esquema;

public class Client {
	public static void main(String[] args) {
		ConcreteStateA concreteStateA=new ConcreteStateA();
		Context context=new Context(concreteStateA);
		context.doThis();
		context.setValue(7);
		context.doThis();
		ConcreteStateB concreteStateB=new ConcreteStateB();
		context.changeState(concreteStateB);
		context.doThis();
		
	}
}
