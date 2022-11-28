package solucion01;

public class Exclusion extends BaseHandler{

	@Override
	public void handle(ObjectOfManaging request) {
		if (request.getValue() == 3) {
			System.out.println("exclusion");
		} else
			super.handle(request);
	}
}
