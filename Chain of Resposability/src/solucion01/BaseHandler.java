package solucion01;

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
	public void handle(ObjectOfManaging request) {
		if(next!=null) {
			next.handle(request);
		}
	}
}
