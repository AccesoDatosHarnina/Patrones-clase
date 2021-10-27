package problema02;

public class Fixer {

	public void fixProblem(Request request) {
		FixType fixType = request.getFixType();
		fixType.fix(request);
	}

}
