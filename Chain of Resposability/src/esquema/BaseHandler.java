package esquema;

import esquema.Handler;
import esquema.RequestCDR;

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
	public void handle(RequestCDR request) {
		if(next!=null) {
			next.handle(request);
		}
	}
}
