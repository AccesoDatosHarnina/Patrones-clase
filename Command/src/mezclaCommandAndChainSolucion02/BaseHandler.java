package mezclaCommandAndChainSolucion02;

public abstract class BaseHandler implements Handler {
	Handler next;

	public BaseHandler() {
		super();
	}

	@Override
	public void setNext(Handler handler) {
		next=handler;
	}
	@Override
	public void handle(Coche request) {
		if(next!=null) {
			next.handle(request);
		}
	}
}
