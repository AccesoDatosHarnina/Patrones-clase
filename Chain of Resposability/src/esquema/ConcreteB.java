package esquema;

import solucion01.BaseHandler;

public class ConcreteB extends BaseHandler {

	@Override
	public void handle(RequestCDR request) {
		// I can handle
		if (request.getValue() == 2) {
			System.out.println("soy el concrete B y soluciono esto");
		} else {
			super.handle(request);
		}
	}

}
