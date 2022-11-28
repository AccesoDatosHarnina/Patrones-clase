package solucion01;

public class Inhibition extends BaseHandler{

	@Override
	public void handle(ObjectOfManaging request) {
		if (request.getValue() == 2) {
			System.out.println("inhibition");
		} else
			super.handle(request);
	}
}
