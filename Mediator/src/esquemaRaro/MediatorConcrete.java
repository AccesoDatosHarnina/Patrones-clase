package esquemaRaro;

public class MediatorConcrete implements Mediator {

	private ComponenteA componenteA;
	private ComponenteB componenteB;
	private ComponenteC componenteC;

	@Override
	public void notify(Object sender) {
		if (sender instanceof ComponenteA) {
			reactOnA();
		}
		if (sender instanceof ComponenteB) {
			reactOnB();
		}
		if (sender instanceof ComponenteC) {
			reactOnC();
		}

	}

	public void reactOnA() {
	}

	public void reactOnB() {

	}

	public void reactOnC() {

	}

}
