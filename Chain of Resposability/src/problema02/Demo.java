package problema02;

public class Demo {

	public static void main(String[] args) {
		Request request = new Request(FixType.a);
		Fixer fixer = new Fixer();
		fixer.fixProblem(request);
		request = new Request(FixType.b);
		fixer = new Fixer();
		fixer.fixProblem(request);
		request = new Request(FixType.c);
		fixer = new Fixer();
		fixer.fixProblem(request);

	}

}
