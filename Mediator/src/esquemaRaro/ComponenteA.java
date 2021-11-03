package esquemaRaro;

public class ComponenteA {
	private Mediator mediator=new MediatorConcrete();
	
	public void operacion() {
		mediator.notify(this);
	}
}
