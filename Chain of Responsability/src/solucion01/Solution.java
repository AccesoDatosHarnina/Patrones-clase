package solucion01;


public class Solution extends BaseHandler {

	@Override
	public void handle(ObjectOfManaging request) {
		if (request.getValue() == 1) {
			System.out.println("solving");
		} else
			super.handle(request);
	}
}
