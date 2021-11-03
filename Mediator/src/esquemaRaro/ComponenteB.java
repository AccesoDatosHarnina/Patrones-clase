package esquemaRaro;

public class ComponenteB {
private Mediator mediator=new MediatorConcrete();
	
	public void operacion() {
		mediator.notify(this);
	}
}
