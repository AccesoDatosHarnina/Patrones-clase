package esquemaRaro;

public class ComponenteC {
private Mediator mediator=new MediatorConcrete();
	
	public void operacion() {
		mediator.notify(this);
	}
}
